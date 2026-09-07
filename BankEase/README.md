# BankEase — Banking Management System

Secure banking REST API built with Java 17, Spring Boot, Spring Data JPA, MySQL and JWT Authentication.

## Features
- User registration/login with BCrypt password hashing
- Stateless JWT authentication and role-based access control
- Account creation, deposits, withdrawals and atomic fund transfers
- Pessimistic locking + @Transactional for transfer integrity
- Paginated transaction history and useful DB indexes
- Docker + Docker Compose
- Health endpoint for deployment platforms

## Run
Java 17 + Maven + MySQL 8+. Create database `bankease`, configure DB_URL/DB_USERNAME/DB_PASSWORD, then `mvn spring-boot:run`.

Docker: `docker compose up --build`

Endpoints: `/api/auth/register`, `/api/auth/login`, `/api/accounts`, `/api/accounts/{accountNumber}/deposit`, `/api/accounts/{accountNumber}/withdraw`, `/api/accounts/transfer`, `/api/accounts/{accountNumber}/transactions`.

Never commit real secrets; set a strong JWT_SECRET in production.