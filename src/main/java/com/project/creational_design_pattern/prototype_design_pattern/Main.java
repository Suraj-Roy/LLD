package com.project.creational_design_pattern.prototype_design_pattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Document documentObj  = new Document("Green world","roman",24,"suraj","biological immunity of plants");

        DocumentCloneFactory factoryObj = new DocumentCloneFactory(documentObj);

        Document obj1 = factoryObj.cloneWithTitle("Green Earth");

        Document obj2 = factoryObj.cloneWithSize(36);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(documentObj);
    }
}
