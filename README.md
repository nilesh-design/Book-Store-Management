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


BookStoreManagement/ <br>
│── src/main/java/com/example/bookstore <br>
│   ├── controller/      # Controllers (Home, Book, Auth) <br>
│   ├── entity/          # JPA Entities <br>
│   ├── repository/      # Repositories <br>
│   ├── service/         # Business Logic <br>
│   └── security/        # Security Config <br>
│ <br>
│── src/main/resources/ <br>
│   ├── static/          # CSS, JS, Images <br>
│   ├── templates/       # Thymeleaf Templates (home.html, login.html, etc.) <br>
│   └── application.properties <br>
│ <br>
│── pom.xml              # Maven dependencies <br>
│── README.md            # Project Documentation <br>
