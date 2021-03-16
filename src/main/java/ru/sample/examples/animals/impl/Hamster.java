package ru.sample.examples.animals.impl;

import ru.sample.examples.animals.Animal;

import java.io.BufferedReader;

public class Hamster extends Animal {

    public Hamster(BufferedReader reader) {
        super(reader);
    }

    @Override
    public String getName() {
        return "Hamster has name: " + super.getName();
    }
}
