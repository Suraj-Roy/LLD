# 🔒 Singleton Design Pattern: Database Connection Manager

## 📝 Problem Statement
You are developing an application that interacts with a database. Creating a database connection manager is **resource-intensive** and expensive. To optimize performance, the application must reuse the same connection manager instance throughout its entire lifecycle.

## 🚀 Requirements
1.  **Single Instance**: Ensure that only one instance of the `DatabaseConnectionManager` class exists.
2.  **Global Access**: All services in the application must access the same shared instance.
3.  **Thread Safety**: (Optional but recommended) The instance creation should be safe in a multi-threaded environment.

---

## ⚠️ The Challenge
If developers instantiate the class using the standard `new` keyword, multiple objects are created, leading to several issues.

### ❌ Example of the Problematic Approach:
```java
DatabaseConnectionManager db1 = new DatabaseConnectionManager();
DatabaseConnectionManager db2 = new DatabaseConnectionManager();

System.out.println(db1 == db2); // Output: false (Two different objects)
```

**This leads to:**
*   **Resource Wastage**: Opening multiple unnecessary connections to the database.
*   **Inconsistent State**: Different parts of the app might have different configurations.
*   **Memory Overhead**: Unnecessary heap allocation for duplicate managers.

---

## ✅ The Solution: Singleton Design Pattern
The **Singleton Pattern** ensures a class has only one instance and provides a global point of access to it.

### 🛠️ Implementation Goal
1.  **Private Constructor**: Prevent instantiation from outside the class.
2.  **Private Static Instance**: Hold the single instance of the class.
3.  **Public Static Method**: Provide a `getInstance()` method that returns the instance (creating it if it doesn't exist).

### 💻 Usage Example
```java
// Accessing the singleton instance
DatabaseConnectionManager db1 = DatabaseConnectionManager.getInstance();
DatabaseConnectionManager db2 = DatabaseConnectionManager.getInstance();

System.out.println(db1 == db2); // Output: true
db1.connect(); // Output: Connected to Database.
```

> **Note:** For production environments, consider using **Double-Checked Locking** or an **Enum Singleton** to ensure the pattern is thread-safe and protected against reflection attacks.