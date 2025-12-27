# Payment Microservices System

A microservices-based payment wallet system built using Spring Boot,
Spring Cloud, and React. The system demonstrates service discovery,
API Gateway routing, and modular backend services.

## System Architecture

The system follows a microservices architecture with the following components:

- **API Gateway** – Single entry point for all client requests
- **Discovery Server** – Service registry using Eureka
- **Payment Service** – Handles payment processing logic
- **Wallet Service** – Manages wallet balance and transactions
- **Payment UI** – React-based frontend application

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Cloud Gateway
- Eureka Discovery Server
- REST APIs
- Maven

### Frontend
- React
- JavaScript

## Project Structure
payment-microservices-system        ← GitHub repository (ROOT)
├── payment-ui
└── payment-microservices-system    ← BACKEND PARENT FOLDER
    ├── api-gateway
    ├── discovery-server
    ├── payment-service
    └── wallet-service


## How to Run Locally

1. Start **Discovery Server**
2. Start **API Gateway**
3. Start **Payment Service**
4. Start **Wallet Service**
5. Run **payment-ui** using `npm start`

## Key Highlights

- Centralized routing using API Gateway
- Service registration and discovery using Eureka
- Independent and scalable microservices
- Clean separation between frontend and backend
