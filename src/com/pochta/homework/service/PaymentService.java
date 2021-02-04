package com.pochta.homework.service;

import com.pochta.homework.entity.Account;
import com.pochta.homework.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount) {
        Bill bill = account.getBill();
        if (bill.getAmount() < amount) {
            System.out.println("Недостаточно средст для выполнения операции!");
        } else {
            int actualAmount = bill.getAmount();
            bill.setAmount(actualAmount - amount);
            System.out.println("Операция завершена, остаток на счете: " + bill.getAmount());
        }
    }
}

