package api.rest.fisi.api.entity;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * ! Indica que esta clase es una entidad JPA y se mapea a la tabla 'registros'.
 */
@Entity
@Table(name = "registros")
/**
 * ? Define una consulta SQL para la eliminación lógica (actualiza el estado en lugar de eliminar).
 */
@SQLDelete(sql = "UPDATE registros SET estado = 0 WHERE idregistro = ?")
/**
 * ? Define una cláusula WHERE para filtrar y obtener solo registros con estado = 1 (activos).
 */
@Where(clause = "estado = 1")
public class Registros {
    /**
     * * Clave primaria de la entidad, generada automáticamente por la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idregistro;
    private String nombres;
    private String apellidos;
    private String email;
    private String cliente_id;
    private String llave_secreta;
    private Integer estado = 1;

    public Integer getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * * Genera un ID de cliente único utilizando SHA-256 basado en nombres, apellidos y correo electrónico.
     */
    public void setCliente_id(String cliente_id) {
        String datos = nombres + apellidos + email;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(datos.getBytes());
        byte[] digest = md.digest();
        String result = new BigInteger(1, digest).toString(16).toLowerCase();
        cliente_id = result;
        this.cliente_id = cliente_id;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    /**
     * * Genera una llave secreta utilizando SHA-256 basado en apellidos, correo electrónico y nombres.
     */
    public void setLlave_secreta(String llave_secreta) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.llave_secreta = encoder.encode(llave_secreta);
    }

    public String getLlave_secreta() {
        return llave_secreta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Registros [idregistro=" + idregistro + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email="
                + email + ", cliente_id=" + cliente_id + ", llave_secreta=" + llave_secreta + ", estado=" + estado
                + "]";
    }
}