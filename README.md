# API REST - Gestión Académica

Este proyecto es una API RESTful desarrollada con Spring Boot y Java para gestionar entidades como Clientes y Registros. Proporciona endpoints para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre estas entidades.

## ✨ Características

* Gestión completa (CRUD) de Clientes.
* Gestión completa (CRUD) de Registros.
* Construido con Spring Boot para un desarrollo rápido y configuración sencilla.
* Utiliza Spring Data JPA para la interacción con la base de datos.
* Conexión a base de datos MySQL.
* Soporte para eliminación lógica mediante las anotaciones `@SQLDelete` y `@Where`.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3.0.6
    * Spring Web
    * Spring Data JPA
* **Base de Datos:** MySQL
* **Build Tool:** Maven
* **Otros:** Hibernate, Jakarta Persistence

## 📋 Prerrequisitos

Antes de empezar, asegúrate de tener instalado lo siguiente:

* JDK 17 o superior ([Descargar aquí](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html))
* Maven ([Descargar aquí](https://maven.apache.org/download.cgi) o instalar vía gestor de paquetes)
* Un servidor de base de datos MySQL corriendo ([Descargar aquí](https://dev.mysql.com/downloads/mysql/))
* Git ([Descargar aquí](https://git-scm.com/downloads))
* (Opcional) Un IDE como IntelliJ IDEA, Eclipse o VS Code con soporte para Java/Spring.
* (Opcional) Una herramienta para probar APIs como Postman o Insomnia.

## 🚀 Instalación y Ejecución

Sigue estos pasos para configurar y ejecutar el proyecto localmente:

1.  **Clona el repositorio:**
    ```bash
    git clone https://github.com/ArturoVela/ApiRest.git
    ```

2.  **Navega al directorio del proyecto:**
    ```bash
    cd ApiRest
    ```

3.  **Configura la base de datos:**
    * Crea una base de datos en tu servidor MySQL (por ejemplo, `rest`).
    * Abre el archivo `src/main/resources/application.properties`.
    * Actualiza las siguientes propiedades con tus credenciales de MySQL:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/rest?useSSL=false
        spring.datasource.username=tu_usuario_mysql # Reemplaza con tu usuario
        spring.datasource.password=tu_contraseña_mysql # Reemplaza con tu contraseña
        ```
    * La propiedad `spring.jpa.hibernate.ddl-auto=update` intentará actualizar el esquema de la base de datos automáticamente al iniciar la aplicación basándose en las entidades JPA.

4.  **Compila el proyecto usando Maven:**
    ```bash
    mvn clean install
    ```

5.  **Ejecuta la aplicación:**
    ```bash
    mvn spring-boot:run
    ```
    O puedes ejecutar la clase principal `api.rest.fisi.api.ApiRestApplication` desde tu IDE.

La API estará disponible en `http://localhost:8080` (o el puerto que hayas configurado).

## 🔌 Endpoints de la API

La URL base es `http://localhost:8080`.

### **Clientes (`/clientes`)**

* `GET /clientes`: Obtiene la lista de todos los clientes.
* `GET /clientes/{id}`: Obtiene un cliente por su ID.
* `POST /clientes`: Crea un nuevo cliente (enviar datos del cliente en el cuerpo de la solicitud en formato JSON).
* `PUT /clientes/{id}`: Actualiza un cliente existente por su ID (enviar datos actualizados en el cuerpo de la solicitud).
* `DELETE /clientes/{id}`: Elimina un cliente por su ID (eliminación lógica).

### **Registros (`/registros`)**

* `GET /registros`: Obtiene la lista de todos los registros.
* `GET /registros/{id}`: Obtiene un registro por su ID.
* `POST /registros`: Crea un nuevo registro.
* `PUT /registros/{id}`: Actualiza un registro existente.
* `DELETE /registros/{id}`: Elimina un registro (eliminación lógica).

*(Nota: Para las operaciones POST y PUT, deberás enviar un cuerpo de solicitud JSON con la estructura correspondiente a la entidad. Revisa las clases de Entidad en `src/main/java/api/rest/fisi/api/entity` para ver los campos requeridos).*

## ⚙️ Configuración

Las principales configuraciones se encuentran en `src/main/resources/application.properties`:

* `server.port`: Puerto en el que correrá la aplicación (por defecto es 8080).
* `spring.datasource.url`: URL de conexión JDBC a tu base de datos MySQL.
* `spring.datasource.username`: Usuario de la base de datos.
* `spring.datasource.password`: Contraseña de la base de datos.
* `spring.jpa.hibernate.ddl-auto`: Estrategia de generación/actualización del esquema de la base de datos (`update`, `create`, `validate`, `none`).
* `spring.jpa.show-sql=true`: Muestra las consultas SQL generadas por Hibernate en la consola (útil para depuración).

## 🧪 Ejecutar Pruebas

Para ejecutar las pruebas unitarias (si existen), usa el siguiente comando Maven:

```bash
mvn test
```

## 📝 Notas

* La eliminación lógica está implementada en las entidades `Clientes` y `Registros` mediante las anotaciones `@SQLDelete` y `@Where`.
* Asegúrate de que la base de datos esté configurada correctamente antes de ejecutar la aplicación.

## 📚 Recursos Adicionales

* [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
* [Documentación de Hibernate](https://hibernate.org/)
* [Documentación de MySQL](https://dev.mysql.com/doc/)
