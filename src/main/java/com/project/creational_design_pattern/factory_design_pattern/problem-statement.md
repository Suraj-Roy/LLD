# 🏭 Factory Design Pattern: Notification System

## 📝 Problem Statement
You are building a notification system for a multi-platform application. The system needs to handle the creation of different notification types dynamically based on user preferences or system triggers.

## 🚀 Requirements
The system should be able to send notifications through the following channels:

*   **📧 Email**: For detailed updates and newsletters.
*   **💬 SMS**: For quick, urgent alerts.

---

## ⚠️ The Challenge
Hardcoding the instantiation of these notification classes throughout the application leads to **tight coupling**. If you decide to add a new channel (like WhatsApp) or change the implementation of an existing one, you would have to modify the code in multiple places.

## ✅ The Solution: Factory Design Pattern
The **Factory Pattern** suggests defining an interface for creating an object, but letting subclasses or a factory class decide which class to instantiate.

### 🛠️ Implementation Goal
1.  **Notification Interface**: Define a common `notifyUser()` method.
2.  **Concrete Products**: Implement `EmailNotification`, `SMSNotification`, and `PushNotification`.
3.  **Notification Factory**: Create a `NotificationFactory` class with a method `createNotification(String type)` that returns the appropriate instance.

### 💻 Usage Example
```java
NotificationFactory factory = new NotificationFactory();
Notification note = factory.createNotification("EMAIL");
note.notifyUser(); // Output: Sending an Email notification...
```

> **Note:** This pattern promotes the **Open/Closed Principle**—the system is open for extension (adding new notification types) but closed for modification (existing client code remains unchanged).