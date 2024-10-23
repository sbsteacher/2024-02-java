package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards;
    private final String[] patterns;

    public CardDeck() {
        cards = new Card[52];
        patterns = new String[]{ "Diamond", "Heart", "Clova", "Spade" };

        //미션1
        // "", "" 값을 가지고 있는 Card객체를 52개를 만들어주시고
        // cards배열에 하나씩 넣어주세요.
        for(int i=0; i<cards.length; i++) {
            cards[i] = new Card("A", "B"); //A(B)
        }

        //enhanced-for문으로 card객체 주소값 전부 출력
        for(Card c : cards) {
            System.out.println(c);
        }
    }

    public String getDenomination(int n) {
        if(n < 1 || n > 13) {
            return "";
        }
        switch(n) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(n);
        }
    }
}
