🏟️ CourtFlow - Real-time Sports Court Booking System
CourtFlow is a high-performance management and reservation system designed for modern sports facilities (Pickleball, Tennis, Badminton). It effectively solves real-time scheduling challenges and ensures data consistency under high-concurrency scenarios, catering to the rapidly growing demand for sports activities.

--------------------------------------------------------------------------------------------
🚀 Key Features
⚡ Real-time Booking: Delivers instant court status updates via WebSocket, preventing race conditions and ensuring no two users can select the same court simultaneously.

🛡️ Concurrency Control: Utilizes Redis Distributed Locks to guarantee data integrity during peak hours when thousands of concurrent "Book Now" requests occur.

📅 Dynamic Pricing: Features an automated pricing engine that adjusts rates based on peak hours, weekends, and specific holiday rules.

💳 Payment Integration: Integrated with secure payment gateways (VNPAY/Momo) to provide a seamless and safe transaction flow.

📊 Admin Dashboard: Provides comprehensive analytics for revenue tracking, occupancy rates, and streamlined user management.

--------------------------------------------------------------------------------------------
🛠️ Tech Stack
Backend
Language: Java 23 (Latest)

Framework: Spring Boot 4.0.2

Security: Spring Security & JWT (State-of-the-art authentication)

Database: MySQL 8.4 (LTS)

Caching & Locking: Redis (High-speed data access)

Messaging: Spring WebSocket (STOMP protocol)

Documentation: Swagger / OpenAPI 3

Infrastructure
Containerization: Docker & Docker Compose

CI/CD: GitHub Actions (Optional)

--------------------------------------------------------------------------------------------
🏗️ Architecture
The project adheres to the Layered Architecture pattern (Controller - Service - Repository) to enhance maintainability and scalability:

Technical Insight: The system leverages Virtual Threads (introduced in Java 21) to optimize the handling of thousands of concurrent I/O-bound requests without overwhelming system resources.

--------------------------------------------------------------------------------------------
📋 Database Schema
The database is designed with high normalization standards (3rd Normal Form - 3NF):

users: Manages account credentials and Role-Based Access Control (RBAC).

courts: Detailed information regarding facility specifications and availability.

bookings: Stores reservation transactions, history, and real-time status.

pricing_rules: Flexible configuration for dynamic rate calculation.