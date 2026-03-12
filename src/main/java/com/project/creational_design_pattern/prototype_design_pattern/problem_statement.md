# 📑 Prototype Design Pattern: Document Cloning System

## 📝 Problem Statement
You are developing a document editor system where users can create and edit various types of documents. Creating a new document from scratch is **resource-intensive** because each document contains complex properties.

### 📄 Document Properties
A document object involves several heavy-weight attributes:
- **Formatting & Styles**
- **Metadata**
- **Templates**
- **Fields**: `title`, `content`, `font`, `size`, `author`

---

## ⚠️ The Challenge: Expensive Initialization
If a user wants to create multiple documents with similar configurations, manually instantiating each one is inefficient and leads to code duplication.

### ❌ Example of Inefficient Creation:
```java
Document doc1 = new Document("Report", "Content", "Arial", 12, "Suraj");
// Manually repeating all parameters for a slight variation
Document doc2 = new Document("Report Copy", "Content", "Arial", 12, "Suraj");
Document doc3 = new Document("Report Copy 2", "Content", "Arial", 12, "Suraj");
```

**This leads to:**
1.  **Repetitive Object Creation**: Passing the same parameters multiple times.
2.  **Expensive Initialization**: High overhead if the object requires database hits or complex processing during construction.
3.  **Tight Coupling**: The client needs to know the internal details of the object to replicate it.

---

## ✅ The Solution: Prototype Design Pattern
Instead of creating new objects from scratch, the **Prototype Pattern** allows us to **clone** an existing object (the prototype) and modify only the specific fields that differ.

### 🚀 Benefits
1.  **Performance**: Cloning an object is usually much faster than creating a new one via `new` if the constructor is heavy.
2.  **Simplicity**: Simplifies object creation when many instances have the same state.
3.  **Dynamic Configuration**: Allows adding or removing objects at runtime by cloning.

### 🛠️ Implementation Goal
1.  **Prototype Interface**: Define a `clone()` method (or implement `Cloneable` in Java).
2.  **Concrete Prototype**: The `Document` class should implement the cloning logic.
3.  **Usage**:
    ```java
    Document original = new Document("Report", "Content", "Arial", 12, "Suraj");
    
    // Clone the original and just change the title
    Document doc2 = (Document) original.clone();
    doc2.setTitle("Report Copy");
    ```

> **Note:** Ensure a **Deep Copy** is performed if the document contains mutable reference types (like a list of images or complex style objects) to avoid unintended side effects between clones.