package api.rest.fisi.api.security;
import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
@Component

public class JwtUtil {
        private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        private final long EXPIRATION_TIME = 100L* 365*24* 60* 60* 1000; // 1 year in milliseconds 
            public String generateToken(String clienteId) {
                    return io.jsonwebtoken.Jwts.builder()
                            .setSubject(clienteId)
                            .setIssuedAt(new Date())
                            .setExpiration(new java.util.Date(System.currentTimeMillis() + EXPIRATION_TIME))
                            .signWith(key)
                            .compact();
            }
            public boolean validadeToken(String token) {
                    try {
                            io.jsonwebtoken.Jwts.parserBuilder()
                                    .setSigningKey(key)
                                    .build()
                                    .parseClaimsJws(token);
                            return true;
                    } catch (Exception e) {
                            return false;
                    }
            }
            public String extraerClienteId(String token) {
                    return io.jsonwebtoken.Jwts.parserBuilder()
                            .setSigningKey(key)
                            .build()
                            .parseClaimsJws(token)
                            .getBody()
                            .getSubject();
            }

}