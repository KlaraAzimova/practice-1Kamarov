package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Maksat", 31, "Ak-Ordo");
        Person person2 = new Person("Nursultan", 12, "Jal");
        Person person3 = new Person("Ainura", 26, "Politex");
        Person person4 = new Person("Datka", 18, "Vostok5");
        Person person5 = new Person("jkjll", 56, "ndnjndj");

        Person[] persons = {person1, person2, person3, person4, person5};

        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {

                Person sort = null;
                if (persons[j].getAge() < persons[i].getAge()) {
                    sort = persons[i];
                    persons[i] = persons[j];
                    persons[j] = sort;
                }

            }
            System.out.println(persons[i] + " ");

        }
    }
}