package com.example.android1dz5;

public class ModelOfItem {
    private String number;
    private String song;
    private String author;
    private String time;

    public ModelOfItem(String number, String song, String author, String time) {
        this.number = number;
        this.song = song;
        this.author = author;
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
