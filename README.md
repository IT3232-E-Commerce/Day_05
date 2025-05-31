# Student Management System

A simple REST API built with Spring Boot for managing students and courses. This project demonstrates basic CRUD operations using a generic controller approach.

## Features

- **Student Management**: Add, view, update, and delete student records
- **Course Management**: Add, view, update, and delete course information
- **Generic CRUD Controller**: Reusable controller template for different entities
- **RESTful API**: Clean and simple REST endpoints
- **In-Memory Storage**: Uses HashMap for data storage (no database required)

## Technologies Used

- Java 17
- Spring Boot 3.5.0
- Spring Web
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Running the Application

1. Clone the repository:
```bash
git clone <repository-url>
cd system
```

2. Run the application using Maven:
```bash
./mvnw spring-boot:run
```

Or on Windows:
```bash
mvnw.cmd spring-boot:run
```

3. The application will start on `http://localhost:8080`

## API Endpoints

### Student Endpoints

| Method | URL | Description | Request Body |
|--------|-----|-------------|--------------|
| GET | `/student/` | Get all students | None |
| GET | `/student/{id}` | Get student by ID | None |
| POST | `/student/{id}` | Add new student | Student JSON |
| PUT | `/student/{id}` | Update student | Student JSON |
| DELETE | `/student/{id}` | Delete student | None |

### Course Endpoints

| Method | URL | Description | Request Body |
|--------|-----|-------------|--------------|
| GET | `/course/` | Get all courses | None |
| GET | `/course/{id}` | Get course by ID | None |
| POST | `/course/{id}` | Add new course | Course JSON |
| PUT | `/course/{id}` | Update course | Course JSON |
| DELETE | `/course/{id}` | Delete course | None |

## Screenshots

![Screenshot 2025-05-31 161441](https://github.com/user-attachments/assets/fe27a6f7-715c-45f0-aa9d-3cf06b344278)
![Screenshot 2025-05-31 161456](https://github.com/user-attachments/assets/324ced47-339f-4edd-a556-a46aef69e0af)
![Screenshot 2025-05-31 161949](https://github.com/user-attachments/assets/118ddb18-8e61-4771-bff7-b41fbf8258de)
![Screenshot 2025-05-31 161544](https://github.com/user-attachments/assets/e5b320c5-59af-4cc6-9e54-4dacf5868e44)
![Screenshot 2025-05-31 162019](https://github.com/user-attachments/assets/f71fe544-024b-4627-bbd9-28dd6dc85bfd)
