package com.green.day12.blackjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("======= Blackjack =======");
        CardDeck cd = new CardDeck();
        Rule rule = new Rule();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Scanner scan = new Scanner(System.in);

        //번갈아 가면서 게이머와, 딜러가 2장의 카드를 받을 수 있게 해주세요.

        for(int i=0; i<2; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }

        //딜러가 16점 이하면 카드를 한장 더 받을 수 있도록 해주세요.
        dealer.needMoreCard(cd);

        while(true) {
            System.out.println("-------------");
            gamer.showYourCards();
            System.out.print("카드를 추가하시겠습니까(종료: n)");
            String input = scan.nextLine();

            //input 문자열에 있는 값이 "n"이면 반복문을 종료하고 싶다.
            if("n".equalsIgnoreCase(input)) {
                break;
            }

            //게이머가 카드 한장 더 받는다.
            gamer.receiveCard(cd.draw());
        }
        System.out.println("-- 딜러의 카드 --");
        dealer.showYourCards();
        rule.getWinner(dealer, gamer);

        System.out.println("게임 끝!!");







    }
}
