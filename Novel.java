package com.onmusic.controller.junit.excel;

import java.util.Date;


public class Novel {

    private String name;
    private String author;
    private Date publishDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Novel(String name, String author, Date publishDate) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }
}
