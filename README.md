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
payment-microservices-system ← GitHub repository (ROOT)
├── payment-ui
└── payment-microservices-system ← BACKEND PARENT FOLDER
    ├── api-gateway
    ├── discovery-server
    ├── payment-service
    └── wallet-service


## How to Run Locally (Correct Order)

> ⚠️ **Important:** Services must be started in the correct order.

### 1️⃣ Discovery Server
Start the Eureka Discovery Server first.

- URL:  http://localhost:8761/
  
---

### 2️⃣ Wallet Service
Start the Wallet Service after Eureka is up.

- Sample API:  http://localhost:8083/wallet/balance/U2

---

### 3️⃣ Payment Service
Start the Payment Service (registers with Eureka).

---

### 4️⃣ API Gateway
Start the API Gateway (routes requests to backend services).

---

### 5️⃣ Payment UI (Frontend)
Run the React UI.

using 
 - npm install
 - npm start

UI URL: http://localhost:3000

## Key Highlights

- Centralized routing using API Gateway
- Service registration and discovery using Eureka
- Independent, loosely coupled microservices
- Clean separation between frontend and backend
