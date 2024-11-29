package ru.netology.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.managers.MoviesManager;

public class MoviesManagerAddTest {

    @Test
    public void addNewMovies () {
        MoviesManager manager = new MoviesManager();

        manager.newMovie("Hellboy");
        manager.newMovie("Iron Man");
        manager.newMovie("Doctor Who");

        String[] expected = {"Hellboy", "Iron Man", "Doctor Who" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovies () {
        MoviesManager manager = new MoviesManager();

        manager.newMovie("Hellboy");
        manager.newMovie("Iron Man");
        manager.newMovie("Doctor Who");

        String[] expected = {"Doctor Who", "Iron Man", "Hellboy"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastThreeMovies () {
        MoviesManager manager = new MoviesManager(3);

        manager.newMovie("Hellboy");
        manager.newMovie("Iron Man");
        manager.newMovie("Doctor Who");
        manager.newMovie("По соображениям совести");
        manager.newMovie("12 лет рабства");
        manager.newMovie("Меч короля");
        manager.newMovie("Доктор Стрендж");

        String[] expected = {"Доктор Стрендж", "Меч короля", "12 лет рабства"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastSixMovies () {
        MoviesManager manager = new MoviesManager(6);

        manager.newMovie("Hellboy");
        manager.newMovie("Hellboy 2");
        manager.newMovie("Iron Man");
        manager.newMovie("Doctor Who");
        manager.newMovie("По соображениям совести");
        manager.newMovie("12 лет рабства");
        manager.newMovie("Меч короля");
        manager.newMovie("Доктор Стрендж");

        String[] expected = {"Доктор Стрендж", "Меч короля", "12 лет рабства", "По соображениям совести", "Doctor Who", "Iron Man"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
