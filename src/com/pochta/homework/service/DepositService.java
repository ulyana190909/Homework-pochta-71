package com.pochta.homework.service;

import com.pochta.homework.entity.Account;
import com.pochta.homework.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        int actualAmount = bill.getAmount();
        bill.setAmount(actualAmount + amount);
        System.out.println("Операция прошла успешно! Баланс : " + bill.getAmount());
    }
}
