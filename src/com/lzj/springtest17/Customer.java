package com.lzj.springtest17;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    private Person person;
    private int type;
    private String action;

    public Customer() {

    }

    @Autowired
    public Customer(Person person) {
        this.person = person;
    }

    public Customer(Person person, int type, String action) {
        this.person = person;
        this.type = type;
        this.action = action;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "person=" + person +
                ", type=" + type +
                ", action='" + action + '\'' +
                '}';
    }
}
