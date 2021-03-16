package ru.sample.examples.animals.impl;

import ru.sample.examples.animals.Animal;

import java.io.BufferedReader;

public class Dog extends Animal {
    public Dog(BufferedReader reader) {
        super(reader);
    }

    @Override
    public String getName() {
        return "Dog has name: " + super.getName();
    }
}
