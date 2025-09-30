# Proyecto Spring Security Basic

Este es un proyecto de ejemplo utilizando **Spring Boot** y **Spring Security** con autenticación básica en memoria.

## 🚀 Características

* Autenticación con **usuarios en memoria**.
* **Roles definidos**: `USER` y `ADMIN`.
* Endpoints protegidos según el rol.
* Contraseñas encriptadas con **BCrypt**.
* Configuración de seguridad con `SecurityFilterChain`.

## 🔑 Configuración de seguridad

* `GET /api/products/**` → público (no requiere autenticación).
* `POST /api/products/**` → solo rol `ADMIN`.
* `PUT /api/products/**` → solo rol `ADMIN`.
* `DELETE /api/products/**` → solo rol `ADMIN`.
* Cualquier otra ruta → requiere estar autenticado.

## 👤 Usuarios en memoria

```text
Usuario: user
Contraseña: 123
Rol: USER

Usuario: admin
Contraseña: 123
Rol: ADMIN
```

## ▶️ Cómo ejecutar

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/ale94/spring-security-basic.git
   ```
2. Entrar al proyecto:

   ```bash
   cd spring-security-basic
   ```
3. Ejecutar con Maven o tu IDE:

   ```bash
   mvn spring-boot:run
   ```

## 📌 Ejemplos de uso

* `GET http://localhost:8080/api/products/1` → acceso público.
* `POST http://localhost:8080/api/products` → requiere autenticación con `admin:123`.

## 🛠️ Tecnologías

* Java 17+
* Spring Boot 3
* Spring Security
* Maven
