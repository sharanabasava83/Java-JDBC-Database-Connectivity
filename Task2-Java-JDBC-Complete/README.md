# Task 2 - Java Database Connectivity (Complete CRUD)

## 📌 Objective
Build a Java application that connects to MySQL database and performs:
- Insert
- Select
- Update
- Delete

## 🛠 Technologies Used
- Java
- MySQL
- JDBC (MySQL Connector/J)

## 📂 Project Structure
- src/DatabaseApp.java
- lib/ (Place mysql-connector-j.jar here)
- database_setup.sql

## 🗄 Database Setup
Run database_setup.sql in MySQL Workbench.

## ▶ How to Run (Windows)

1. Download MySQL Connector/J
2. Place .jar file inside lib folder
3. Change MySQL password in code
4. Compile:

javac -cp "lib/*" src/DatabaseApp.java

5. Run:

java -cp "lib/*;src" DatabaseApp

## ✅ Expected Output
- Database Connected
- Insert Success
- Update Success
- Delete Success
- Employee Records Displayed
