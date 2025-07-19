# Constructor-Based Dependency Injection in Spring

This is a simple Spring Framework project demonstrating how to implement Dependency Injection using constructor methods. It also explores the use of ApplicationContext for managing beans.

## 🛠 Technologies Used

- Java
- Spring Framework (Core)
- Spring Tool Suite (STS)

## 📂 Project Structure

com.example.studentproject
│
├── MainApp.java // Entry point using ApplicationContext
├── StudentService.java // Dependent class (uses constructor injection)
└── Student.java // Dependency class (a simple POJO)


## 💡 Features

- Constructor-based Dependency Injection
- Bean configuration using applicationContext.xml
- Demonstration of ApplicationContext for managing beans

## 🚀 How to Run

1. Clone the repository:

    bash
    git clone https://github.com/lifeline024/constructor-di-string
    cd constructor-di-spring
    

2. Open the project in Spring Tool Suite (STS) or IntelliJ IDEA.

3. Run the MainApp.java class.

## ✅ Expected Output

When you run the application, it should output a message that confirms the constructor injection was successful, like:
I am your Principal.
MathTeacher is teaching mathematics...
Welcome to the College!

## 📄 License

This project is licensed under the MIT License.
