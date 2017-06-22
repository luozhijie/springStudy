package com.lzj.springtest14.second;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Customer {

    private String name;

    private double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", amount=" + amount + "]";
    }

}
