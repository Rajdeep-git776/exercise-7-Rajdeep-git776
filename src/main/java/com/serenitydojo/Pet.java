package com.serenitydojo;

public abstract class Pet {
    String name;
    int age;
    public Pet(String name, int age) {
        this.name = name;
        this.age= age;

    }

    public abstract String play();
}
