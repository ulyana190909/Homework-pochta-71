package com.pochta.homework.service;

import com.pochta.homework.entity.Account;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount) {
        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();

        if (billFromAmount < amount) {
            System.out.println("Невозможно совершить операцию! Не хватает средств!");
        } else {
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод со счета пользователя : " + accountFrom.getHolder().getName() + " на счет пользователя : " + accountTo.getHolder().getName() + " выполнен успешно!");
        }
    }
}
