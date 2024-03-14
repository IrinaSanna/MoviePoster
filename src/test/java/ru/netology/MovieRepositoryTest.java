package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieRepositoryTest {

    MovieItem item1 = new MovieItem(1, "Бладшот", "боевик", 2015, 5);
    MovieItem item2 = new MovieItem(2, "Вперёд", "мультфильм", 2019, 6);
    MovieItem item3 = new MovieItem(3, "Отель 'Белград'", "комедия", 2021, 3);
    MovieItem item4 = new MovieItem(4, "Джентельмены", "боевик", 2020, 10);
    MovieItem item5 = new MovieItem(5, "Человек невидимка", "ужасы", 2018, 7);
    MovieItem item6 = new MovieItem(6, "Тролли. Мировой тур", "мультфиль", 2011, 7);
    MovieItem item7 = new MovieItem(7, "Номер один", "комедия", 2018, 5);

    @Test
    public void addingMovie() {
        MovieRepository repo = new MovieRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);

        MovieItem[] expected = {item1, item2, item3, item4, item5};
        MovieItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieMoreStandard() {
        MovieRepository repo = new MovieRepository(6);

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);
        repo.add(item7);

        MovieItem[] expected = {item7, item6, item5, item4, item3, item2};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieMin() {
        MovieRepository repo = new MovieRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        MovieItem[] expected = {item3, item2, item1};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieMax() {
        MovieRepository repo = new MovieRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);
        repo.add(item7);

        MovieItem[] expected = {item7, item6, item5, item4, item3};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieAll() {
        MovieRepository repo = new MovieRepository(8);

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);
        repo.add(item7);

        MovieItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}