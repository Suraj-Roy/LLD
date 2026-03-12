package com.project.creational_design_pattern.singleton_design_pattern;

public class DatabaseConnectionManager {

    private static DatabaseConnectionManager dbConnectionObj = null;

    private DatabaseConnectionManager() {
    }

    public static DatabaseConnectionManager getDbConnectionObj() {
        if(dbConnectionObj==null){
            return dbConnectionObj = new DatabaseConnectionManager();
        }
        else{
            return dbConnectionObj;
        }
    }

    public void testConnection(){
         System.out.println("Connection Sucessfull");
    }
}
