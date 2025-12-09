package edu.shadsluiter.comments.model;

import java.time.LocalDateTime;

public class AppComment {

    private int id;
    private String author;
    private String content;
    private LocalDateTime timestamp;

    // Constructor used in initialData (with explicit id)
    public AppComment(int id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.timestamp = LocalDateTime.now(); // set timestamp when created
    }

    // Constructor used in addComment(String author, String content)
    public AppComment(int id, String author, String content, LocalDateTime timestamp) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.timestamp = (timestamp != null) ? timestamp : LocalDateTime.now();
    }

    // Optional convenience constructor (if you ever want to create without id)
    public AppComment(String author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "AppComment{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
