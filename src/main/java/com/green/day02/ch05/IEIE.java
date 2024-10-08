package com.green.day02.ch05;

public class IEIE {
    public static void main(String[] args) {
        int n = 120;

        if(n < 0) {
            System.out.printf("%d는 0 미만\n", n);
        } else if(n < 50) {
            System.out.printf("%d는 50 미만\n", n);
        } else if(n < 100) {
            System.out.printf("%d는 100 미만\n", n);
        } else {
            System.out.printf("%d는 100 이상\n", n);
        }
        /*
        if-elseif-else 이것도 그룹이 된다. 그 중 하나만 실행될 수 있다.
        elseif의 갯수 제한은 없다. 조건을 추가하고 싶은만큼 추가할 수 있다.
        다만, 조건은 위에서 아래로 순차적으로 물어보고 가장 빨리 만나는 true만
        실행하는데 true조건이 없다면 else 가 실행된다.
        else는 필수가 아닌 옵션, else가 없으면 하나도 실행이 안되는 상황이 발생
        될 수 있지만 else가 있으면 하나는 무조건 실행된다.
         */
        System.out.println("--끝--");
    }
}
