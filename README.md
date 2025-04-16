# API REST - Gestión Académica

Este proyecto es una API RESTful desarrollada con Spring Boot y Java para gestionar entidades académicas como Alumnos, Profesores, Cursos, Carreras y Matrículas. Proporciona endpoints para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre estas entidades.

## ✨ Características

* Gestión completa (CRUD) de Alumnos.
* Gestión completa (CRUD) de Profesores.
* Gestión completa (CRUD) de Cursos.
* Gestión completa (CRUD) de Carreras.
* Gestión completa (CRUD) de Matrículas.
* Construido con Spring Boot para un desarrollo rápido y configuración sencilla.
* Utiliza Spring Data JPA para la interacción con la base de datos.
* Conexión a base de datos MySQL.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3.0.6
    * Spring Web
    * Spring Data JPA
* **Base de Datos:** MySQL
* **Build Tool:** Maven
* **Otros:** Lombok (para reducir código boilerplate)

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
    git clone [https://github.com/ArturoVela/ApiRest.git](https://github.com/ArturoVela/ApiRest.git)
    ```

2.  **Navega al directorio del proyecto:**
    ```bash
    cd ApiRest
    ```

3.  **Configura la base de datos:**
    * Crea una base de datos en tu servidor MySQL (por ejemplo, `gestion_academica_db`).
    * Abre el archivo `src/main/resources/application.properties`.
    * Actualiza las siguientes propiedades con tus credenciales de MySQL:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/gestion_academica_db?createDatabaseIfNotExist=true # Reemplaza 'gestion_academica_db' si usaste otro nombre
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
    O puedes ejecutar la clase principal `com.example.ApiRest.ApiRestApplication` desde tu IDE.

La API estará disponible en `http://localhost:8080` (o el puerto que hayas configurado).

## ⚙️ Configuración

Las principales configuraciones se encuentran en `src/main/resources/application.properties`:

* `server.port`: Puerto en el que correrá la aplicación (por defecto es 8080).
* `spring.datasource.url`: URL de conexión JDBC a tu base de datos MySQL.
* `spring.datasource.username`: Usuario de la base de datos.
* `spring.datasource.password`: Contraseña de la base de datos.
* `spring.jpa.hibernate.ddl-auto`: Estrategia de generación/actualización del esquema de la base de datos (`update`, `create`, `validate`, `none`).
* `spring.jpa.show-sql=true`: Muestra las consultas SQL generadas por Hibernate en la consola (útil para depuración).

## 🔌 Endpoints de la API

La URL base es `http://localhost:8080`.

Aquí hay algunos ejemplos de los endpoints disponibles (se recomienda usar Postman o similar para probarlos):

**Alumnos (`/alumnos`)**

* `GET /alumnos`: Obtiene la lista de todos los alumnos.
* `GET /alumnos/{id}`: Obtiene un alumno por su ID.
* `POST /alumnos`: Crea un nuevo alumno (enviar datos del alumno en el cuerpo de la solicitud en formato JSON).
* `PUT /alumnos/{id}`: Actualiza un alumno existente por su ID (enviar datos actualizados en el cuerpo de la solicitud).
* `DELETE /alumnos/{id}`: Elimina un alumno por su ID.

**Profesores (`/profesores`)**

* `GET /profesores`: Obtiene la lista de todos los profesores.
* `GET /profesores/{id}`: Obtiene un profesor por su ID.
* `POST /profesores`: Crea un nuevo profesor.
* `PUT /profesores/{id}`: Actualiza un profesor existente.
* `DELETE /profesores/{id}`: Elimina un profesor.

**Cursos (`/cursos`)**

* `GET /cursos`: Obtiene la lista de todos los cursos.
* `GET /cursos/{id}`: Obtiene un curso por su ID.
* `POST /cursos`: Crea un nuevo curso.
* `PUT /cursos/{id}`: Actualiza un curso existente.
* `DELETE /cursos/{id}`: Elimina un curso.

**Carreras (`/carreras`)**

* `GET /carreras`: Obtiene la lista de todas las carreras.
* `GET /carreras/{id}`: Obtiene una carrera por su ID.
* `POST /carreras`: Crea una nueva carrera.
* `PUT /carreras/{id}`: Actualiza una carrera existente.
* `DELETE /carreras/{id}`: Elimina una carrera.

**Matrículas (`/matriculas`)**

* `GET /matriculas`: Obtiene la lista de todas las matrículas.
* `GET /matriculas/{id}`: Obtiene una matrícula por su ID.
* `POST /matriculas`: Crea una nueva matrícula.
* `PUT /matriculas/{id}`: Actualiza una matrícula existente.
* `DELETE /matriculas/{id}`: Elimina una matrícula.

*(Nota: Para las operaciones POST y PUT, deberás enviar un cuerpo de solicitud JSON con la estructura correspondiente a la entidad. Revisa las clases de Entidad en `src/main/java/com/example/ApiRest/Entity` para ver los campos requeridos)*.

## 🧪 Ejecutar Pruebas

Para ejecutar las pruebas unitarias (si existen), usa el siguiente comando Maven:

```bash
mvn test
