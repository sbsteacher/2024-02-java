package com.green.day12.blackjack;

public class Rule {
    private static final int MAX_POINT = 21;
    public void getWinner(Dealer dealer, Gamer gamer) {
        //1. 각 게이머(게이머, 딜러)의 점수를 얻을 수 있어야 한다.
        //2. 값을 비교해서 누가 이겼는지 출력
        //3. 비겼다 or 누가 이겼다.

        //비겼는 경우: 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우

//        int dealerPoint = dealer.getPoint();
//        int gamerPoint = gamer.getPoint();

        int dealerPoint = 21;
        int gamerPoint = 18;

        if((dealerPoint == gamerPoint) || (dealerPoint > MAX_POINT && gamerPoint > MAX_POINT)) {
            System.out.println("비겼습니다.");
        } else if((dealerPoint <= MAX_POINT && dealerPoint > gamerPoint) || gamerPoint > MAX_POINT) { //딜러가 이기는 경우
            System.out.println("딜러 승");
        } else {
            System.out.println("게이머 승");
        }
        System.out.println("------------");

        if((dealerPoint == gamerPoint) || (dealerPoint > MAX_POINT && gamerPoint > MAX_POINT)) {
            System.out.println("비겼습니다.");
        } else if( (dealerPoint <= MAX_POINT) && (gamerPoint <= MAX_POINT) ) {
            if(dealerPoint > gamerPoint) {
                System.out.println("딜러 승");
            } else {
                System.out.println("게이머 승");
            }
        } else if(dealerPoint > MAX_POINT) {
            System.out.println("게이머 승");
        } else {
            System.out.println("딜러 승");
        }
    }
}
