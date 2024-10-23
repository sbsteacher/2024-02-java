package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.getDenomination(1)); //"A"
        System.out.println(cardDeck.getDenomination(2)); //"2"
        System.out.println(cardDeck.getDenomination(3)); //"3"
        System.out.println(cardDeck.getDenomination(10)); //"10"
        System.out.println(cardDeck.getDenomination(11)); //"J"
        System.out.println(cardDeck.getDenomination(12)); //"Q"
        System.out.println(cardDeck.getDenomination(13)); //"K"
        System.out.println(cardDeck.getDenomination(14)); //""
    }
}
