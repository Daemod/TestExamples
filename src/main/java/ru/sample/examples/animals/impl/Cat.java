package ru.sample.examples.animals.impl;

import ru.sample.examples.animals.Animal;

import java.io.BufferedReader;
import java.io.IOException;

public class Cat extends Animal {

    public Cat(BufferedReader reader) {
        super(reader);
    }

    @Override
    public String getName() {
        try {
            this.name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.getName();
    }
}
