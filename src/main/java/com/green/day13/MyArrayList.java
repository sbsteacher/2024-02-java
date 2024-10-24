package com.green.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int num) {
        int[] tmp = new int[arr.length + 1];

        arr = tmp;
    }


    @Override
    public String toString() {
        if(arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);
        for(int i=1; i<arr.length; i++) {
            sb.append(", ");
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
