package api.rest.fisi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ! Clase principal que inicia la aplicación Spring Boot.
 */
@SpringBootApplication
public class ApiApplication {

    /**
     * * Método principal que se ejecuta al iniciar la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}