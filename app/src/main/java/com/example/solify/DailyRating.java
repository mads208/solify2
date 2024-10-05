package com.example.solify;

public class DailyRating {
    private String date;
    private int rating;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public DailyRating(String date, int rating) {
        this.date = date;
        this.rating = rating;
    }

    public DailyRating() {
    }
}
