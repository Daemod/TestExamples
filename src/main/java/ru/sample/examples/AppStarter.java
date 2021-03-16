package ru.sample.examples;

import ru.sample.examples.animals.Animal;
import ru.sample.examples.animals.impl.Cat;
import ru.sample.examples.animals.impl.Dog;
import ru.sample.examples.animals.impl.Hamster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppStarter {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Animal cat = new Cat(reader);
        System.out.println(cat.getName());
        Animal dog = new Dog(reader);
        Animal hamster = new Hamster(reader);

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
