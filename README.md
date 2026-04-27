# Spring Boot Student Management REST API

A backend REST API for managing student records built using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**.  
This project demonstrates layered architecture, entity mapping, repository usage, and database-driven CRUD operations.

---

## 🚀 Features

- Create new student records
- Retrieve all students
- Retrieve student by ID
- Automatic table creation using Hibernate
- REST API architecture using Spring Boot
- Database integration with MySQL
- Layered backend structure using Controller, Entity, Repository

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven

---

## 📂 Project Architecture

The application follows layered backend architecture:

```
Controller Layer → REST APIs
Repository Layer → Database interaction
Entity Layer → Hibernate mapped classes
Database Layer → MySQL
```

---

## 📁 Project Structure

```
springboot-student-management-rest-api
│
├── src/main/java/com/aurionpro/jparepo
│   ├── controller
│   │   └── StudentController.java
│   │
│   ├── entity
│   │   └── Student.java
│   │
│   ├── repository
│   │   └── StudentRepository.java
│   │
│   └── JparepoDemoAppApplication.java
│
├── src/main/resources
│   └── application.properties
│
├── pom.xml
```

---

## ⚙️ Database Configuration

Update your database configuration inside:

```
src/main/resources/application.properties
```

Example configuration:

```
spring.datasource.url=jdbc:mysql://localhost:3306/studentsdb
spring.datasource.username=root
spring.datasource.password=your_password_here

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run the Project

### Step 1: Create MySQL database

```
CREATE DATABASE studentsdb;
```

### Step 2: Update database credentials

Modify:

```
application.properties
```

with your MySQL username and password.

### Step 3: Run application

Run:

```
JparepoDemoAppApplication.java
```

as:

```
Run As → Java Application
```

Spring Boot server starts at:

```
http://localhost:8080
```

---

## 📡 Sample API Endpoints

Example endpoints available:

```
GET /students
GET /students/{id}
POST /students
```

These endpoints allow retrieval and insertion of student records using REST API calls.

---

## 🧪 Example Output (JSON Response)

Example:

```
[
  {
    "id": 1,
    "name": "Samruddhi"
  }
]
```

---

## 📊 Learning Outcomes

This project demonstrates:

- Spring Boot project setup using Spring Initializr
- REST controller development
- Entity creation using Hibernate annotations
- Database interaction using Spring Data JPA
- Automatic schema update with Hibernate
- MySQL integration with Spring Boot
- Maven project structure handling

---

## 👩‍💻 Author

**Samruddhi Bansode**

AI & Data Science Engineer  
Aspiring Java Backend Developer
