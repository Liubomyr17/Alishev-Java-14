package com.company;


public class Solution {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        System.out.println("My name is "+person1.name + "," + " and I'm " + person1.age + " years old.");
        Person person2 = new Person();
        person2.name = "Volodymyr";
        person2.age = 20;
        System.out.println("My name is "+person2.name + "," + " and I'm " + person2.age + " years old.");

    }
}

class Person {
    // Дані (поля)
    // Дії (методи)
    String name;
    int age;
}