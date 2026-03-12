# 🏗️ Builder Design Pattern: User Object Construction

## 📝 Problem Statement
You are developing a system that requires the creation of complex `User` objects. These objects contain a mix of **mandatory** and **optional** fields.

### 👤 User Fields

| Type | Field | Requirement |
| :--- | :--- | :--- |
| `int` | **id** | 🔴 Mandatory |
| `String` | **name** | 🔴 Mandatory |
| `String` | **email** | ⚪ Optional |
| `String` | **phone** | ⚪ Optional |
| `String` | **address** | ⚪ Optional |
| `int` | **age** | ⚪ Optional |

---

## ⚠️ The Challenge: Telescoping Constructors
As the number of optional fields grows, creating constructors for every possible combination becomes unmanageable and unreadable. This is known as the **Telescoping Constructor Problem**.

### ❌ Example of the Messy Approach:
```java
public class User {
    // Too many combinations!
    User(int id, String name) { ... }
    User(int id, String name, String email) { ... }
    User(int id, String name, String email, String phone) { ... }
    User(int id, String name, String email, String phone, String address) { ... }
    // ... and so on
}
```

---

## ✅ The Solution: Builder Design Pattern
The **Builder Pattern** provides a flexible solution to various object creation problems in object-oriented programming.

### 🚀 Benefits
1.  **Readability**: The client code becomes much easier to read and write.
2.  **Immutability**: Can be used to create immutable objects by not providing setters.
3.  **Control**: Mandatory parameters are passed to the Builder's constructor, while optional ones are set via fluent methods.

### 🛠️ Implementation Goal
Implement a `UserBuilder` inner class that allows creating a `User` object like this:
```java
User user = new User.UserBuilder(1, "John Doe")
                .setEmail("john@example.com")
                .setAge(25)
                .build();
```