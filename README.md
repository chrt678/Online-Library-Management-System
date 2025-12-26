🚀 Project Overview
A full-stack, secure library management system built using:
Java, Spring Boot, Thymeleaf, Spring Security, JWT, and SQL.
Manages books, categories, users, issue/return flows, and automated fines
Role-based access: Admin and User
Secure JWT authentication and CSRF protection
Dynamic dashboards for Admin and Users

🖥️ Screenshots / UI Preview
Replace placeholders with your real screenshots
Admin Dashboard


User Dashboard
�
Book Issue & Return Flow
�

🛠️ Tech Stack
Layer
Technology
Backend
Java, Spring Boot
Frontend
Thymeleaf, HTML, CSS
Security
Spring Security, JWT, BCrypt
Database
MySQL / SQL
Build Tool
Maven
Version Control
Git

👤 Key Features:

🔐 Authentication & Authorization
...............................
Secure Login / Logout

JWT token-based authentication
Role-based access (Admin / User).

Unauthorized access blocked.

📘 Book Management (Admin)

Add / Update / Delete books
Assign to categories
Track availability status

🗂️ Category Management

Create / Update / Delete categories
Category-wise book listing

🔄 Issue & Return System
Automatic issue & due date calculation
Real-time status update
Overdue fine calculation
🔍 Search & Listing
Search by Title, Author, Category
Pagination for large lists

📊 Dashboard 
Admin: Total books, issued books, users, pending returns
User: Issued books, due dates, fines.


🗄️ Database / ER Diagram
Replace with actual ER diagram
�
Tables: users, roles, user_roles, books, categories, issued_books
Relationships:
One User → Many Issued Books
One Category → Many Books.

🔐 Security Highlights
Custom UserDetailsService for authentication
BCrypt password encryption
Secured endpoints using Spring Security + JWT
Role-based access control & CSRF handled

📝 API Endpoints (Summary)
Method
Endpoint
Description
Role
POST
/api/auth/login
User/Admin login
Public
POST
/api/auth/register
User registration
Public
GET
/api/books
Get all books
User/Admin
POST
/api/books
Add a book
Admin
PUT
/api/books/{id}
Update book
Admin
DELETE
/api/books/{id}
Delete book
Admin
GET
/api/books/search?query=
Search books
User/Admin
POST
/api/issue
Issue a book
Admin
POST
/api/return
Return a book
Admin/User
GET
/api/users
Get all users
Admin
PUT
/api/users/{id}/status
Activate/deactivate 

💡 Project Highlights
Full-stack from scratch
Secure library system with JWT + Spring Security
Automated fine & due date logic
Dynamic dashboards for Admin & Users
Ready for portfolio, GitHub showcase, and interviews.


🏆 Outcome
Professional-level library management system
Efficient workflow automation
Can be upgraded into College ERP or SaaS platform.









