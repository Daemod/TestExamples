package ru.sample.examples.animals;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Animal {
    private final BufferedReader reader; // создаем пустую ссылку.

    int age;
    private String name;

    public Animal(BufferedReader reader) {
        this.reader = reader; //присваиваем ссылку, которую передали из main.
    }

    public int getAge() {
        return age; // Пока что просто создан :D
    }

    public String getName() {
        try {
            name = reader.readLine(); // Считываем из консоли строку.
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }
}
