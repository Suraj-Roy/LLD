Problem Statement: Clone a Document Object

You are developing a document editor system where users can create and edit different types of documents.

Creating a new document from scratch is expensive because the document contains many properties such as:

formatting

styles

metadata

templates

Fields of Document

Example fields:

title

content

font

size

author

Problem

If a user wants to create multiple documents with similar configurations, creating each document from scratch becomes inefficient.

Example:

Document doc1 = new Document("Report", "Content", "Arial", 12, "Suraj");
Document doc2 = new Document("Report Copy", "Content", "Arial", 12, "Suraj");
Document doc3 = new Document("Report Copy 2", "Content", "Arial", 12, "Suraj");

Here the same configuration is repeatedly created.

This leads to:

repetitive object creation

expensive initialization

unnecessary code duplication

Solution

Instead of creating new objects every time, we can clone an existing object and modify only the required fields.

This approach is implemented using the Prototype Design Pattern.