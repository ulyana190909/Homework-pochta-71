package com.pochta.homework.entity;

public class Account {
    private Bill bill;
    private Person holder;

    public Account(Bill bill, Person holder) {
        this.bill = bill;
        this.holder = holder;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Person getHolder() {
        return holder;
    }

    public void setHolder(Person holder) {
        this.holder = holder;
    }
}
