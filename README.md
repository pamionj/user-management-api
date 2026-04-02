# User Management API

API REST desarrollada con Spring Boot para la gestión de usuarios, implementando un CRUD completo con persistencia en PostgreSQL.

---

## 🧰 Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Bean Validation (jakarta.validation)
- Maven

---

## 📐 Arquitectura

El proyecto sigue una arquitectura en capas:

- **Controller** → Manejo de requests HTTP
- **Service** → Lógica de negocio
- **Repository** → Acceso a datos (JPA)
- **DTO** → Validación y desacople de entrada

---

## ⚙️ Funcionalidades

- Crear usuario
- Listar usuarios
- Obtener usuario por ID
- Actualizar usuario
- Eliminar usuario
- Validación de datos de entrada
- Manejo global de errores

---

## 📡 Endpoints

| Método | Endpoint        | Descripción           |
|--------|----------------|-----------------------|
| GET    | /users         | Listar usuarios       |
| GET    | /users/{id}    | Obtener usuario       |
| POST   | /users         | Crear usuario         |
| PUT    | /users/{id}    | Actualizar usuario    |
| DELETE | /users/{id}    | Eliminar usuario      |

---

## 🧪 Ejemplo Request

```json
{
  "name": "Pablo",
  "email": "pablo@test.com"
}
```
---

## ❌ Validaciones

name: obligatorio (@NotBlank)

email: formato válido (@Email)

## ⚠️ Manejo de errores

### Validación

```
{
  "errors": [
    "El nombre no puede estar vacío",
    "Debe ser un email válido"
  ]
}
```

### Usuario no encontrado
```
{
  "error": "Usuario no encontrado"
}
```

## 🗄️ Base de datos

### Base de datos PostgreSQL.

Ejemplo consulta:
```
SELECT * FROM users;
```

## ▶️ Ejecución del proyecto

1. Clonar repositorio

2. Configurar base de datos en application.properties

3. Ejecutar:

Run en el archivo > UserManagementApiApplication.java
 
```
mvn spring-boot:run
```
API disponible en:
```
http://localhost:8080
```

## 🧪 Testing

La API fue probada usando Postman, validando:

- CRUD completo
- Validaciones (400 Bad Request)
- Manejo de errores (404 Not Found)
- Persistencia en PostgreSQL ejecutando queries directamente en PostgreSQL con psql

|          Postman           |             psql              |
|:--------------------------:|:-----------------------------:|
| ![Postman](images/GET.png) | ![psql](images/psql-demo.png) |

## 📬 Postman Collection

Se incluye una colección de Postman para probar la API fácilmente.

### ▶️ Cómo usar

1. Abrir Postman
2. Importar archivo:


/postman/postman_collection.json


3. Ejecutar los endpoints disponibles:

- Create User
- Get All Users
- Get User By ID
- Update User
- Delete User
---
👨‍💻 Autor
Pablo Amion | Ingeniería informática

Proyecto desarrollado como práctica backend orientada a API REST con Spring Boot.