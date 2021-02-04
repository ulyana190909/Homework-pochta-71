package com.pochta.homework.entity;

public class Adjustment {
    private Bill bill;

    public Adjustment(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
