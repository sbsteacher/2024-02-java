package com.green.day16.ch26;
//p.643
public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1 = new Outer.Nested1();
        nst1.add(10);
        nst1.add(2);

        Outer.Nested2 nst2 = new Outer.Nested2();
        System.out.println(nst2.get());
    }
}

class Outer {
    private static int num;

    //static nested class
    static class Nested1 {
        void add(int val) {
            num += val;
        }
    }

    static class Nested2 {
        int get() { return num; }
    }
}
