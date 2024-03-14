package ru.netology;

public class MovieItem {

    private int id;
    private String name;
    private String genre;
    private int yearReleased;
    private int rating;

    public MovieItem(int id, String name, String genre, int yearReleased, int rating) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.yearReleased = yearReleased;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}