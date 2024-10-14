package com.green.day05.ch07;

public class BankAccountPO {
    static int balance = 0; //static 전역변수

    static int deposit(int amount) { //입금을 담당하는 메소드
        //balance = balance + amount;
        balance += amount;
        return balance;
    }

    static int withdraw(int amount) {
        balance = balance - amount;
        return balance;
    }

    static int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}
