# Hospital Management System (Spring Boot + JWT)

## Project Overview

A backend REST API project built using Spring Boot and JWT Authentication.
This project demonstrates how to build a secured backend application with
user authentication and patient management using industry-standard practices.

## Technologies Used

- Java 17
- Spring Boot 4.0.5
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- MySQL
- Lombok
- Maven
- Postman (for API testing)

## Project Structure

hospital-management-system/
├── src/main/java/com/example/hms
│   ├── config/
│   │   ├── SecurityConfig.java
│   │   ├── JwtAuthenticationFilter.java
│   │   └── JwtService.java
│   ├── controller/
│   │   ├── AuthController.java
│   │   └── PatientController.java
│   ├── dto/
│   │   ├── AuthRequest.java
│   │   ├── AuthResponse.java
│   │   └── PatientDto.java
│   ├── entity/
│   │   ├── User.java
│   │   ├── Role.java
│   │   └── Patient.java
│   ├── repository/
│   │   ├── UserRepository.java
│   │   └── PatientRepository.java
│   ├── service/
│   │   ├── AuthService.java
│   │   └── PatientService.java
│   └── HospitalManagementSystemApplication.java
├── src/main/resources/
│   └── application.properties
└── pom.xml

## Modules

### Auth Module
- User Registration
- User Login
- JWT Token Generation
- JWT Token Validation
- API Security

### Patient Module
- Add Patient
- Get All Patients
- Get Patient By ID
- Update Patient
- Delete Patient

## API Endpoints

### Auth APIs

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| POST | /api/auth/register | Register new user | No |
| POST | /api/auth/login | Login user | No |

### Patient APIs

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| POST | /api/patients | Add new patient | Yes |
| GET | /api/patients | Get all patients | Yes |
| GET | /api/patients/{id} | Get patient by ID | Yes |
| PUT | /api/patients/{id} | Update patient | Yes |
| DELETE | /api/patients/{id} | Delete patient | Yes |

## Sample Requests

### Register User
```json
POST /api/auth/register
{
    "name": "Sparsh Garg",
    "email": "sparsh@gmail.com",
    "password": "Sparsh@123"
}
```

### Login User
```json
POST /api/auth/login
{
    "email": "sparsh@gmail.com",
    "password": "Sparsh@123"
}
```

### Add Patient
```json
POST /api/patients
Authorization: Bearer <your_token>
{
    "name": "Rahul Kumar",
    "age": 27,
    "gender": "Male",
    "disease": "Fever",
    "address": "Delhi",
    "phoneNumber": "9876543210"
}
```

## Authorization

After login, copy the JWT token from the response and add it to the request header:
Authorization: Bearer <your_jwt_token>

## Database Setup

```sql
CREATE DATABASE hospital_db;
```

Update `application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

## Branch Strategy

| Branch | Description |
|--------|-------------|
| main | README only |
| dev | Base project structure |
| feature/project-setup | JWT dependency + configuration |
| feature/entity-layer | Entity classes |
| feature/dto-layer | DTO classes |
| feature/repository-layer | Repository interfaces |
| feature/service-layer | Service classes |
| feature/config-layer | JWT + Security configuration |
| feature/controller-layer | REST API controllers |

## How to Run

1. Clone the repository
2. Create MySQL database: `CREATE DATABASE hospital_db;`
3. Update `application.properties` with your MySQL password
4. Run the application from `HospitalManagementSystemApplication.java`
5. Test APIs using Postman on `http://localhost:8080`

## Author

**Sparsh Garg**
