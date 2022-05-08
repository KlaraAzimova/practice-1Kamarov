package com.company;

public class Person {
    private String name;
    private int age;
    private String adress;

    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age){
            System.out.println(this.age);
        }else {

        }
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    @Override
    public String toString() {
        return "Person: " +
                "name - " + name +
                ", age - " + age +
                ", adress - " + adress;

    }
}
