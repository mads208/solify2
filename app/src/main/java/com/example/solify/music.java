package com.example.solify;

public class music {
    private String title;
    private String artist;
    private int rating;
    private boolean isFavorite;
    private boolean isPlaying;
    private int duration;
    private int position;
    private int image;
    private String album;

    public music(String title, String artist, int rating, boolean isFavorite, boolean isPlaying, int duration, int position, int image, String url, String genre, String album) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.isFavorite = isFavorite;
        this.isPlaying = isPlaying;
        this.duration = duration;
        this.position = position;
        this.image = image;
        this.url = url;
        this.genre = genre;
        this.album = album;
    }

    private String url;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public music() {
    }
}
