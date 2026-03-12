# 🔔 Problem Statement: Multi-Channel Notification System

## Overview
You are tasked with building a robust **Notification System** for a cross-platform application. The system must support multiple communication channels and be extensible enough to handle different themes or providers (e.g., Professional vs. Casual templates) in the future.

## Requirements
The system should be able to send notifications through the following primary channels:

*   **📧 Email**: For long-form communication and official records.
*   **💬 SMS**: For urgent, time-sensitive alerts.

## Design Challenge
The goal is to implement this using the **Abstract Factory Design Pattern** to ensure:
1.  **Consistency**: Related notification types (e.g., all "Urgent" variants) are created together.
2.  **Decoupling**: The client code should not be tied to specific concrete classes of notifications.
3.  **Scalability**: Adding a new channel or a new style of notification should require minimal changes to existing code.

---

### 🛠️ Expected Components
1.  **Abstract Factory Interface**: Declares methods for creating each type of notification.
2.  **Concrete Factories**: Implementations for specific variants (e.g., `DefaultNotificationFactory`, `EncryptedNotificationFactory`).
3.  **Product Interfaces**: Interfaces for `Email`, `SMS`, and `PushNotification`.
4.  **Concrete Products**: Specific implementations for each channel.

> **Note:** Focus on how the factory will manage the creation logic so the application can switch between notification providers or styles seamlessly.