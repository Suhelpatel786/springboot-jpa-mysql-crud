# 📚 Spring Boot Author-Book Management API

A simple Spring Boot REST API to manage Authors and their Books using JPA and MySQL.

## 📌 Features

- Add, update, delete, and get **Books**
- Add, update, delete, and get **Authors**
- One-to-Many relationship: One author can have many books
- Automatically deletes all books when an author is deleted
- Prevents infinite loops using DTOs or proper serialization strategy

---

## 🧰 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Maven

---

## 🗃 Database Schema

- `Author` table:
  - `id`, `name`, `age`
- `Book` table:
  - `isbn`, `title`, `author_id` (foreign key)

---

## 🚀 How to Run

Follow these steps to run the project locally:

1. **Clone the repository**

   ```bash
   git clone https://github.com/Suhelpatel786/springboot-jpa-mysql-crud.git
   cd springboot-jpa-mysql-crud

2. **Set environment variables**

   Before running the application, set the following environment variables:

   - `DB_URL=jdbc:mysql://<host>:<port>/<database-name>`
   - `DB_USER=<your-db-username>`
   - `DB_PASSWORD=<your-db-password>`

   These variables will be used in your `application.properties`:

   ```properties
   spring.datasource.url=${DB_URL}
   spring.datasource.username=${DB_USER}
   spring.datasource.password=${DB_PASSWORD}

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true

3. **Run the application**

   After setting up the environment variables, you can run the Spring Boot application using:

   ```bash
   ./mvnw spring-boot:run

