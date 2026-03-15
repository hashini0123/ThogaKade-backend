# ThogaKade — Backend API 

A Spring Boot REST API backend for the **ThogaKade** retail shop management system.

> 🔗 Frontend: [ThogaKade_Frontend](https://github.com/hashini0123/ThogaKade_Frontend)

---

## Tech Stack

- **Java 21** + **Spring Boot 3**
- **Spring Data JPA** (Hibernate)
- **MySQL 8**
- **Maven**

---

## Getting Started

### 1. Create the Database

```sql
CREATE DATABASE thogakade_db;
```

### 2. Configure `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/thogakade_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run

```bash
./mvnw spring-boot:run
```

API runs at: `http://localhost:8080`

---

## API Endpoints

Base URL: `/api/v1`

| Method | Endpoint | Description |
|---|---|---|
| GET / POST | `/customers` | Get all / Add customer |
| GET / PUT / DELETE | `/customers/{id}` | Get, Update, Delete customer |
| GET / POST | `/items` | Get all / Add item |
| GET / PUT / DELETE | `/items/{code}` | Get, Update, Delete item |
| GET / POST | `/orders` | Get all / Place order |
| GET / DELETE | `/orders/{id}` | Get, Cancel order |

---

## CORS Setup

Requests from `http://localhost:4200` (Angular dev server) are allowed by default.

---

## Author

**Hashini Nanayakkara** — Undergraduate Software Engineering Student

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/hashini-nanayakkara-11402137a/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=flat&logo=github&logoColor=white)](https://github.com/hashini0123)
