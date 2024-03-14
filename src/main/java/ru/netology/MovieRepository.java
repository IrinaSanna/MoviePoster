package ru.netology;

import ru.netology.MovieItem;

public class MovieRepository {
    private MovieItem[] items = new MovieItem[0];
    private int movieLimit;

    public MovieRepository() {
        this.movieLimit = 5;
    }

    public MovieRepository(int movieLimit) {
        this.movieLimit = movieLimit;
    }

    public void add(MovieItem item) {
        MovieItem[] tmp = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (movieLimit < items.length) {
            resultLength = movieLimit;
        } else {
            resultLength = items.length;
        }

        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }
}