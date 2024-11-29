package ru.netology.managers;

public class MoviesManager {

    private String[] movieName = new String[0];
    private int numbers;

    public MoviesManager() {
        this.numbers = 5;
    }

    public MoviesManager(int numbers) {
        this.numbers = numbers;
    }

    public void newMovie (String name) {
        String[] tmp = new String[movieName.length + 1];
        for (int i = 0; i < movieName.length; i++) {
            tmp[i] = movieName[i];
        }
        tmp[tmp.length -1 ] = name;
        movieName = tmp;
    }

    public String[] findAll() {
        return movieName;
    }

    public String[] findLast() {
        int resultLength;

        if (movieName.length < numbers) {
            resultLength = movieName.length;
        } else {
            resultLength = numbers;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movieName[movieName.length - 1 - i];
        }
        return tmp;
    }
}
