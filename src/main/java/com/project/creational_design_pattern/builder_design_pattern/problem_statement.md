Problem Statement: Build a User Object

You are developing a system where you need to create User objects.
Some fields are mandatory, while others are optional.

Fields of User

Mandatory fields

id

name

Optional fields

email

phone

address

age

Problem

If you try to create constructors for all combinations, it becomes messy.

Example:

User(int id, String name)
User(int id, String name, String email)
User(int id, String name, String email, String phone)
User(int id, String name, String email, String phone, String address)

This is called the Telescoping Constructor Problem.

To solve this, we implement the Builder Design Pattern.