package com.project.creational_design_pattern.prototype_design_pattern;

public class DocumentCloneFactory {

    private Document documentObj;

    public DocumentCloneFactory(Document documentObj) {
        this.documentObj = documentObj;
    }

    public Document cloneWithTitle(String title) throws CloneNotSupportedException {
        Document obj = documentObj.clone();
        obj.setTitle(title);
        return obj;
    }
    public Document cloneWithSize(Integer size) throws CloneNotSupportedException {
        Document obj = documentObj.clone();
        obj.setSize(size);
        return obj;
    }

    //so on.....
}
