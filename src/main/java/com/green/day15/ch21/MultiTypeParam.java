package com.green.day15.ch21;

public class MultiTypeParam {
    public static void main(String[] args) {
        /*
            DBox<String, Integer> {
                private String left;
                private Integer right;

                void setter(String left, Integer right) {
                    this.left = left;
                    this.right = right;
                }
            }
            위 처럼 작성된 class를 객체화 한 것과 같은 효과가 난다.
         */
        DBox<String, Integer> box = new DBox<>();
        box.setter("Apple", 25);
        //box.setter("Apple", "25"); //호출타입이 맞지 않는다.
        System.out.println(box);

        System.out.println("---------------");
        DBox<Integer, Apple> box2 = new DBox<>();
        /*
            DBox<Integer, Apple> {
                private Integer left;
                private Apple right;

                void setter(Integer left, Apple right) {
                    this.left = left;
                    this.right = right;
                }
            }
            위 처럼 작성된 class를 객체화 한 것과 같은 효과가 난다.
         */
    }
}

class DBox<L, R> {
    private L left;
    private R right;

    void setter(L left, R right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("%s & %s", left, right);
    }
}
