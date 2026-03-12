package com.project.creational_design_pattern.prototype_design_pattern;

public class Document implements Cloneable{

    private  String title;

    private String font;

    private Integer size;

    private String author;

    private String content;


    public Document() {
    }

    public Document(String title, String font, Integer size, String author, String content) {
        this.title = title;
        this.font = font;
        this.size = size;
        this.author = author;
        this.content = content;
    }

    @Override
    protected Document clone() throws CloneNotSupportedException {
        return (Document)super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", font='" + font + '\'' +
                ", size=" + size +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
