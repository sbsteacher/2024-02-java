package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.checkCards();
        System.out.println("-----------");
        Card c = cd.draw();
        System.out.println(c);
        System.out.println("-----------");
        cd.checkCards();

    }
}
