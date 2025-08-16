📚 Book Store Management System

A Book Store Management System built using Java, Spring Boot, Spring Security, Thymeleaf, Bootstrap, and MySQL.
This application allows users to browse available books, register/login securely, add books, manage personal book collections, and logout safely.

🚀 Features

🔐 User Authentication & Authorization (Spring Security)

🏠 Home Page with introduction and navigation

📖 Available Books – view all available books in the store

📚 My Books – personal book list management

➕ Register New Book – add new books to the store

👤 User Registration & Login with role-based access

🚪 Logout Functionality with success message

🎨 Responsive UI using Bootstrap

🛠️ Tech Stack

Backend: Java, Spring Boot, Spring Security, JPA/Hibernate

Frontend: Thymeleaf, HTML5, CSS3, Bootstrap

Database: MySQL

Build Tool: Maven

IDE Recommended: STS / Eclipse


BookStoreManagement/
│── src/main/java/com/example/bookstore
│   ├── controller/      # Controllers (Home, Book, Auth)
│   ├── entity/          # JPA Entities
│   ├── repository/      # Repositories
│   ├── service/         # Business Logic
│   └── security/        # Security Config
│
│── src/main/resources/
│   ├── static/          # CSS, JS, Images
│   ├── templates/       # Thymeleaf Templates (home.html, login.html, etc.)
│   └── application.properties
│
│── pom.xml              # Maven dependencies
│── README.md            # Project Documentation
