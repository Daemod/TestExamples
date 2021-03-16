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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Создаем экземляр для чтения из консоли

        Animal cat = new Cat(reader); //передаем ссылку reader в cat
        System.out.println(cat.getName());

        Animal dog = new Dog(reader); //передаем ссылку reader в dog
        System.out.println(dog.getName());

        Animal hamster = new Hamster(reader);//передаем ссылку reader в hamster
        System.out.println(hamster.getName());

        try {
            reader.close(); //Закрываем чтение из консоли, т.к мы передавли ссылку на reader то BufferedReader закроется во всех Animals.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
