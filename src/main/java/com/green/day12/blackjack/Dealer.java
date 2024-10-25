package com.green.day12.blackjack;

public class Dealer extends Gamer {
    public void needMoreCard(CardDeck cd) {
        //본인이 16점 이하면 카드 한장 더 받는다.
        if(point <= 16) {
            Card c = cd.draw();
            receiveCard(c);
        }
    }
}
