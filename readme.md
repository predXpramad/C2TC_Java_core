
---

# 📘 **Placement Management System – Login Module**

### 📂 **Module: Login & Authentication (Without JWT)**

### 🧩 **Project: Placement Management System**

---

# 📌 **1. Module Overview**

The **Login Module** is the entry point of the *Placement Management System* and is responsible for:

* User Registration
* User Login
* Password Encryption (BCrypt)
* Username Uniqueness Validation
* Role Handling (`UNIVERSITY`, `STUDENT`, `COMPANY`, etc.)
* Basic Security Configuration (Spring Security without JWT)

This module was built using:

* **Spring Boot 4.x**
* **Spring Web**
* **Spring Data JPA**
* **Spring Security (Permit-All, No JWT)**
* **PostgreSQL**
* **Postman** for API testing

---

# 📌 **2. Project Structure (Module-Specific)**

```
src/main/java/com/placement
│
├── PlacementManagementSystemApplication.java
│
├── config
│   └── SecurityConfig.java
│
├── controller
│   └── AuthController.java
│
├── dto
│   └── LoginRequest.java
│
├── entity
│   └── User.java
│
└── repository
    └── UserRepository.java
```

---

# 📌 **3. Database Schema (Generated Automatically)**

**Table: users**

| Column   | Type    | Constraints            |
| -------- | ------- | ---------------------- |
| id       | BIGINT  | Primary Key, Auto Inc  |
| username | VARCHAR | Unique, Not Null       |
| password | VARCHAR | BCrypt Hashed          |
| name     | VARCHAR | User's full name       |
| type     | VARCHAR | UNIVERSITY/STUDENT/... |
| enabled  | BOOLEAN | Default: true          |

Example row after registration:

| id | username | password (hashed) | name           | type       | enabled |
| -- | -------- | ----------------- | -------------- | ---------- | ------- |
| 1  | uni1     | $2a$10$...        | University One | UNIVERSITY | true    |

---

# 📌 **4. Security Configuration**

The system uses **Spring Security**, but **JWT is not used** per project requirements.
Instead:

* `/api/auth/**` → **public (no login required)**
* All other routes → **permitAll()** during development

Password encryption is handled using:

```
BCryptPasswordEncoder
```

---

# 📌 **5. API Endpoints – Login Module**

## ✅ **1) Register User**

**POST** `/api/auth/register`

### Request Body

```json
{
  "username": "uni1",
  "password": "Pass@123",
  "name": "University One",
  "type": "UNIVERSITY"
}
```

### Success Response

**201 Created**

```json
{
  "id": 1,
  "username": "uni1",
  "name": "University One",
  "type": "UNIVERSITY",
  "enabled": true,
  "password": null
}
```

### Error Response (username exists)

**409 Conflict**

```json
"Username already exists"
```

---

## ✅ **2) Login User**

**POST** `/api/auth/login`

### Request Body

```json
{
  "username": "uni1",
  "password": "Pass@123"
}
```

### Success Response

**200 OK**

```json
{
  "id": 1,
  "username": "uni1",
  "name": "University One",
  "type": "UNIVERSITY",
  "enabled": true
}
```

### Invalid Credentials Response

**401 Unauthorized**

```json
"Invalid credentials"
```

---

## ✅ **3) Test Endpoint**

**GET** `/api/test/hello`

### Response

**200 OK**

```
Hello secured!
```

---

# 📌 **6. Complete Postman Test Suite**

### **Test 1 — Register: Success**

```
POST http://localhost:8080/api/auth/register
Content-Type: application/json

{
  "username": "uni1",
  "password": "Pass@123",
  "name": "University One",
  "type": "UNIVERSITY"
}
```

### **Test 2 — Register: User Already Exists**

```
POST http://localhost:8080/api/auth/register
Content-Type: application/json

{
  "username": "uni1",
  "password": "AnotherPass",
  "name": "Duplicate User",
  "type": "UNIVERSITY"
}
```

Expected:
`409 Conflict` → `"Username already exists"`

---

### **Test 3 — Login: Success**

```
POST http://localhost:8080/api/auth/login
Content-Type: application/json

{
  "username": "uni1",
  "password": "Pass@123"
}
```

---

### **Test 4 — Login: Wrong Password**

```
POST http://localhost:8080/api/auth/login
Content-Type: application/json

{
  "username": "uni1",
  "password": "WrongPass"
}
```

Expected:
`401 Unauthorized` → `"Invalid credentials"`

---

### **Test 5 — Login: Unknown Username**

```
POST http://localhost:8080/api/auth/login
Content-Type: application/json

{
  "username": "nouser",
  "password": "abc123"
}
```

Expected:
`401 Unauthorized`

---

### **Test 6 — Hello Test Endpoint**

```
GET http://localhost:8080/api/test/hello
```

Response:

```
Hello secured!
```

---

# 📌 **7. Technologies Used**

| Technology      | Purpose                   |
| --------------- | ------------------------- |
| Spring Boot     | Web application framework |
| Spring Web      | REST API handling         |
| Spring Data JPA | ORM + DB interaction      |
| Spring Security | Basic security config     |
| BCrypt          | Password hashing          |
| PostgreSQL      | Database                  |
| Postman         | API testing               |

---

# 📌 **8. How to Run the Module**

### Step 1 — Configure Database

Create database:

```sql
CREATE DATABASE placementdb;
```

Create user:

```sql
CREATE USER placement_user WITH PASSWORD 'placement_pass';
GRANT ALL PRIVILEGES ON DATABASE placementdb TO placement_user;
```

### Step 2 — Update `application.yml` (already set)

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/placementdb
    username: placement_user
    password: placement_pass
```

### Step 3 — Build & Run

In IntelliJ or terminal:

```
mvn clean install
mvn spring-boot:run
```

---

# 📌 **9. What This Module Achieves (as per Project Requirement)**

✔ User Registration
✔ User Login
✔ Password Encryption
✔ Duplicate Username Validation
✔ Roles Support (University, Student, Company…)
✔ Proper API Responses
✔ Fully Tested with Postman
✔ Clean Architecture & Documentation

---

# 📌 **10. Next Modules (Future Work)**

* Student Module
* Company Module
* Placement Officer Module
* Drive Creation / Applications
* Admin Dashboard
