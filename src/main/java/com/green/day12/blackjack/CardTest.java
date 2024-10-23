package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();

        Card c = cd.draw();
        Card c2 = cd.draw();
        cd.checkCard();
    }
}
