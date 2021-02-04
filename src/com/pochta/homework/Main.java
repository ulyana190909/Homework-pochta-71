package com.pochta.homework;

import com.pochta.homework.entity.Account;
import com.pochta.homework.entity.Bill;
import com.pochta.homework.entity.Person;
import com.pochta.homework.service.DepositService;
import com.pochta.homework.service.PaymentService;
import com.pochta.homework.service.TransferService;

public class Main {
    public static void main(String[] arg) {
        Person maryPerson = new Person("Mary", "Ivanova", "+78595478565");
        Bill billMary = new Bill(52000);
        Account accountMary = new Account(billMary, maryPerson);

        Person vasyaPerson = new Person("Vasya", "Andreev", "+79857587575");
        Bill billVasya = new Bill(29000);
        Account accountVasya = new Account(billVasya, vasyaPerson);


        PaymentService paymentService = new PaymentService();
        paymentService.pay(accountMary, 1000);
        paymentService.pay(accountVasya, 15000);

        DepositService depositService = new DepositService();
        depositService.deposit(accountMary, 6000);
        depositService.deposit(accountVasya, 20000);

        TransferService transferService = new TransferService();
        transferService.transfer(accountMary, accountVasya, 5000);
        transferService.transfer(accountVasya, accountMary, 50000);
    }
}
