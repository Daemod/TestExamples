package ru.sample.examples.animals.impl;

import ru.sample.examples.animals.Animal;

import java.io.BufferedReader;

public class Cat extends Animal {

    public Cat(BufferedReader reader) {
        super(reader);
    }

    @Override
    public String getName() {
        return "Cat have name: " + super.getName();
    }
}
