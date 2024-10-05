package com.example.solify;

public class Journaling {
    private String title;
    private String content;
    private String date;
    private boolean isCompleted;

    public Journaling(String title, String content, String date, boolean isCompleted) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.isCompleted = isCompleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Journaling() {
    }

}
