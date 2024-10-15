package com.green.day06.ch07;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = ba1; //주소값 복사 == 얕은 복사 == Shallow Copy

        ba1.deposit(1000);
        ba2.checkMyBalance();
    }
}











