package com.project.creational_design_pattern.singleton_design_pattern;

public class Main {

    public static void main(String[] args) {
        DatabaseConnectionManager obj = DatabaseConnectionManager.getDbConnectionObj();
        obj.testConnection();
    }
}
