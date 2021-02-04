package com.pochta.homework.entity;

public class Bill {
    private int amount;

    public Bill(int account) {
        this.amount = account;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
