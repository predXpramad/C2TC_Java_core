
# 🛒 Shopping Mall Management System – **User Management Module**

This repository contains the **User Management Module** developed as part of the **Shopping Mall Management System** case study.
The module enables creating users, logging in, updating user details, retrieving user information, and logging out.



---

# 📁 **1. Project Overview**

The project follows a **layered architecture** according to the sprint plan:

```
Controller → Service → Repository → Database → Postman Testing
```

This module implements the following User-related features:

* ➕ Create User
* 🔐 Login User
* 🔄 Update User
* 🔍 Get User by ID
* 🚪 Logout User

---

# ⚙️ **2. Initial Project Setup**

### ✅ Step 1 — Create Spring Boot Project

Using IntelliJ Spring Initializr:

**Project Settings**

* Type: **Maven**
* Language: **Java**
* Spring Boot: **4.0.0**
* Java Version: **17 or 21**
* Packaging: **JAR**
* Group: `com.tnsif`
* Artifact: `user`
* Root Package: `com.tnsif.user`

**Selected Dependencies**

* Spring Web
* Spring Data JPA
* PostgreSQL Driver
* Spring Boot DevTools

> `spring-boot-starter-test` is added automatically in Spring Boot 4.x projects.

---

# 🗂 **3. Folder Structure**

The project follows a clean structure with **one file per folder**, as required.

```
src/main/java/com/tnsif/user/
│
├── controller/
│     └── UserController.java
│
├── entity/
│     └── User.java
│
├── repository/
│     └── UserRepository.java
│
├── service/
│     └── UserService.java   (interface + implementation)
│
└── UserModuleApplication.java
```

---

# 🛠 **4. application.yml Configuration**

Created at:

```
src/main/resources/application.yml
```

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/smmsdb
    username: smms_user
    password: smms_pass
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true

server:
  port: 8080
```

---

# 🗄 **5. PostgreSQL Setup (psql)**

### Step 1 — Create database

```sql
CREATE DATABASE smmsdb;
```

### Step 2 — Create user

```sql
CREATE USER smms_user WITH PASSWORD 'smms_pass';
```

### Step 3 — Grant permissions

(Needed so Hibernate can create tables)

```sql
GRANT CONNECT ON DATABASE smmsdb TO smms_user;
GRANT USAGE ON SCHEMA public TO smms_user;
GRANT CREATE ON SCHEMA public TO smms_user;
```

---

# 🧱 **6. Code Implementation**

## 6.1 User Entity (User.java)

Defines the User structure based on class design:

```java
@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private String password;
    // getters & setters
}
```

---

## 6.2 Repository Layer (UserRepository.java)

```java
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String name);
}
```

---

## 6.3 Service Layer (UserService + UserServiceImpl)

Implements business logic for signup, login, update, logout.

Key methods:

* `addNewUser(User user)`
* `updateUser(User user)`
* `login(String name, String password)`
* `logout(Integer userId)`

---

## 6.4 Controller Layer (UserController.java)

REST endpoints:

| HTTP Method | Endpoint                 | Description     |
| ----------- | ------------------------ | --------------- |
| POST        | `/api/users/signup`      | Create new user |
| POST        | `/api/users/login`       | Login user      |
| GET         | `/api/users/{id}`        | Retrieve user   |
| PUT         | `/api/users/{id}`        | Update user     |
| POST        | `/api/users/{id}/logout` | Logout          |

Example controller snippet:

```java
@PostMapping("/signup")
public ResponseEntity<?> signup(@RequestBody User user) {
    return ResponseEntity.ok(svc.addNewUser(user));
}
```

---

# 🧪 **7. Postman Testing**

Below are the exact test cases executed and verified.

---

## ✔ 7.1 Signup (Create User)

**POST**

```
http://localhost:8080/api/users/signup
```

**Body**

```json
{
  "name": "alice",
  "type": "CUSTOMER",
  "password": "pass123"
}
```

**Expected Response:**

* `200 OK`
* JSON with auto-generated ID

---

## ✔ 7.2 Login

**POST**

```
http://localhost:8080/api/users/login
```

**Body**

```json
{ "name": "alice", "password": "pass123" }
```

**Expected Response:**
`200 OK` with user data.

---

## ✔ 7.3 Get User by ID

**GET**

```
http://localhost:8080/api/users/1
```

**Expected Response:**
User JSON.

---

## ✔ 7.4 Update User

**PUT**

```
http://localhost:8080/api/users/1
```

**Body**

```json
{
  "name": "alice",
  "type": "CUSTOMER",
  "password": "newpass"
}
```

**Expected:**
Updated user details.

---

## ✔ 7.5 Logout

**POST**

```
http://localhost:8080/api/users/1/logout
```

**Expected:**

```
"Logged out"
```

---

# 🎯 **8. Completed Features Summary**

### ✔ User Entity Implemented

### ✔ Repository Layer Implemented

### ✔ Service Layer Implemented

### ✔ Controller Layer Implemented

### ✔ PostgreSQL Integrated

### ✔ Hibernate Successfully Created `users` Table

### ✔ All Endpoints Tested on Postman

### ✔ Project runs successfully on port 8080

This completes the **full functional User Management Module** as per the project requirements.

---

# 🏁 **10. Conclusion**

This module was built step-by-step using Spring Boot, PostgreSQL, and REST.
All required use cases — Signup, Login, View, Update, Logout — are fully working and tested.



---

