package ru.sample.examples.animals;

import java.io.BufferedReader;

public abstract class Animal {
    protected BufferedReader reader;

    int age;
    protected String name;

    public Animal(BufferedReader reader) {
        this.reader = reader;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
