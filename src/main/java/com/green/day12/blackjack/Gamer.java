package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card객체 주소값 여러개 저장할 수 있어야 합니다.
    //ArrayList 사용할꺼임
    //멤버필드 선언. 변수명은 cards
    protected final List<Card> cards;
    protected int point;

    public Gamer() {
        cards = new ArrayList();
    }

    public void receiveCard(Card c1) {
        //new switch expression
        this.point += switch(c1.getDenomination()) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(c1.getDenomination());
        };

        String str = "10";
        int val = Integer.parseInt(str); //val 변수에 10 정수값이 주입된다.
        cards.add(c1);
    }

    public void showYourCards() {
        //System.out.println(cards);
        for(int i=0; i<cards.size(); i++) {
            Card item = cards.get(i);
            System.out.println(item);
        }
//        for(Card item : cards) {
//            System.out.println(item);
//        }
    }

    public int getPoint() {
        return point;
    }

    public List<Card> openCards() {
        return cards;
    }

}
