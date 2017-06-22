package com.lzj.springtest7;

public class Person {
    private String name;
    private String address;
    private int age;

    //getter and setter methods


    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", age = " + age + ", name = " + name + "]";
    }
}
