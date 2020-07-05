package com.springboot.basics.SpringBootApp.basic;

public class Book {

    long id;
    String name;
    String author;


    public Book (long id,String name,String author)
    {
        super();
        this.id=id;
        this.name=name;
        this.author=author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
