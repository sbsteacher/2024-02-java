package com.green.day06.ch07;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = ba1; //주소값 복사 == 얕은 복사 == Shallow Copy

        ba1.deposit(1000);
        ba2.checkMyBalance();

        //BankAccount ba1 가 의미하는 바는
        //참조변수, 변수명 ba1, 주소값 저장
        //BankAccount객체 주소값만!!!!! 저장 가능
    }
}











