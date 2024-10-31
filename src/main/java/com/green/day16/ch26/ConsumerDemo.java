package com.green.day16.ch26;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> cons = v -> System.out.println(v < 0 ? -v : v);

        cons.accept(10); //콘솔에 "10"
        cons.accept(-20); //콘솔에 "20"
        cons.accept(-30); //콘솔에 "30"
        cons.accept(30); //콘솔에 "30"

        Consumer<String> cons2 = str -> System.out.printf("%s는(은) %d글자입니다.\n", str, str.length());

        cons2.accept("abc"); //콘솔에 "abc는(은) 3글자입니다."
        cons2.accept("dddd"); //콘솔에 "dddd는(은) 4글자입니다."
        cons2.accept("asdfasfdasf"); //콘솔에 "dddd는(은) 4글자입니다."

    }
}
