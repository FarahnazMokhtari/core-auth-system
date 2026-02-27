
# User Authentication System

## Purpose
Simple user registration and login system using Core Java.
Prepared for Sweden market.

## Why no Spring?
To fully understand authentication logic, separation of concerns, and design decisions.


## Features (planned)
- User registration
- Login with hashed password
- In-memory storage
===========================================================================================
---

# 🛡 Core Auth System (Plain Java)

A simple authentication system built with pure Java (no frameworks) to demonstrate understanding of:

* Object-Oriented Programming
* Clean Architecture (Domain, Repository, Service layers)
* Password hashing with BCrypt
* Input validation
* Console-based interaction
* Separation of concerns

---

## 📌 Project Structure

```
com.Farahnaz
│
├── model
│   └── User.java
│
├── repository
│   ├── UserRepository.java
│   └── InMemoryUserRepository.java
│
├── service
│   └── AuthService.java
│
├── util
│   └── PasswordUtil.java
│
└── Main.java
```

---

## 🔐 Features

### ✅ Register

* Email normalization (lowercase)
* Duplicate email check
* Password hashing using BCrypt
* Validation for null or blank inputs

### ✅ Login

* User lookup by email
* Password verification using BCrypt
* Proper exception handling

### ✅ Security

* Passwords are never stored in plain text
* BCrypt with configurable cost factor
* Protection against rainbow table attacks
* Slow hashing to reduce brute-force risk

---

## 🧠 Architecture Overview

### 1️⃣ Model Layer

Represents business objects (User).

### 2️⃣ Repository Layer

Responsible for data access.
Currently implemented with an in-memory storage for simplicity.

### 3️⃣ Service Layer

Contains business logic:

* Validation
* Hashing
* Authentication rules

### 4️⃣ Utility Layer

Handles password hashing and verification.

---

## 🔑 Password Security

This project uses **BCrypt**:

* Built-in salting
* Adaptive cost factor
* Secure password comparison

Example:

```java
String hash = PasswordUtil.hash(password);
boolean valid = PasswordUtil.matches(rawPassword, storedHash);
```

---

## ▶ How to Run

1. Clone the repository
2. Add `jbcrypt-0.4.jar` to project libraries
3. Run `Main.java`
4. Use the console menu to:

   * Register
   * Login
   * Exit




