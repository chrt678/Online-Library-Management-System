## 🚀 Project Overview:-

A full-stack, secure library management system built using:

Java, Spring Boot, Thymeleaf, Spring Security, JWT, and SQL.

** 
Manages books, categories, users, issue/return flows, and automated fines
Role-based access: Admin and User
Secure JWT authentication and CSRF protection
Dynamic dashboards for Admin and Users
**

## 🖥️ Screenshots / UI 

 Admin Dashboard 
OnlineLibraryManagementSystem/Screenshot_20251226_113533_LinkedIn.jpg


User Dashboard
OnlineLibraryManagementSystem/Screenshot_20251226_113516_LinkedIn.jpg


Book Issue & Return Flow


## 🛠️ Tech Stack:



| Category | Technologies |
|--------|--------------|
| **Backend** | Java, Spring Boot |
| **Frontend** | Thymeleaf, HTML, CSS |
| **Security** | Spring Security, JWT, BCrypt |
| **Database** | MySQL, SQL |
| **Build Tool** | Maven |
| **Version Control** | GitHub |


## 👤 Key Features:

1.🔐 Authentication & Authorization
......................................
Secure Login / Logout

JWT token-based authentication
Role-based access (Admin / User).

Unauthorized access blocked.

2.📘 Book Management (Admin)

Add / Update / Delete books

Assign to categories

Track availability status

🗂️ Category Management

Create / Update / Delete categories

Category-wise book listing

🔄 Issue & Return System

Automatic issue & due date calculation
Real-time status update
Overdue fine calculation.

🔍 Search & Listing

Search by Title, Author, Category
Pagination for large lists.

📊 Dashboard 
Admin: Total books, issued books, users, pending returns
User: Issued books, due dates, fines.


## 🔐 Security Highlights:

Custom UserDetailsService for authentication.

BCrypt password encryption

Secured endpoints using Spring Security + JWT

Role-based access control & CSRF handled

## 📝 API Endpoints (Summary):

| Method | Endpoint | Description |
|------|----------|-------------|
| POST | `/api/auth/login` | User / Admin login |
| POST | `/api/auth/register` | User registration |
| GET | `/api/books` | Get all books |
| POST | `/api/books` | Add a new book |
| PUT | `/api/books/{id}` | Update book details |
| DELETE | `/api/books/{id}` | Delete a book |
| GET | `/api/books/search?query=` | Search books |
| POST | `/api/issue` | Issue a book |
| POST | `/api/return` | Return a book |
| GET | `/api/users` | Get all users |
| PUT | `/api/users/{id}/status` | Activate / Deactivate user |



## 💡 Project Highlights:

Full-stack from scratch

Secure library system with JWT + Spring Security.
Automated fine & due date logic.
Dynamic dashboards for Admin & Users.
Ready for portfolio, GitHub showcase, and interviews.


## 🏆 Outcome
Professional-level library management system
Efficient workflow automation
Can be upgraded into College ERP or SaaS platform.









