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
│ &nbsp;&nbsp;&nbsp;  ├── controller/ &nbsp;&nbsp;&nbsp;     # Controllers (Home, Book, Auth) <br>
│ &nbsp;&nbsp;&nbsp;  ├── entity/     &nbsp;&nbsp;&nbsp;     # JPA Entities <br>
│ &nbsp;&nbsp;&nbsp;  ├── repository/ &nbsp;&nbsp;&nbsp;     # Repositories <br>
│ &nbsp;&nbsp;&nbsp;  ├── service/    &nbsp;&nbsp;&nbsp;     # Business Logic <br>
│ &nbsp;&nbsp;&nbsp;  └── security/   &nbsp;&nbsp;&nbsp;     # Security Config <br>
│ <br>
│── src/main/resources/ <br>
│ &nbsp;&nbsp;&nbsp;  ├── static/     &nbsp;&nbsp;&nbsp;     # CSS, JS, Images <br>
│ &nbsp;&nbsp;&nbsp;  ├── templates/  &nbsp;&nbsp;&nbsp;     # Thymeleaf Templates (home.html, login.html, etc.) <br>
│ &nbsp;&nbsp;&nbsp;  └── application.properties <br>
│ <br>
│── pom.xml               &nbsp;     # Maven dependencies <br>
│── README.md             &nbsp;     # Project Documentation <br>
