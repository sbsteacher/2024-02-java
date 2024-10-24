package com.green.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        clear();
    }

    public void add(int num) {
        int[] tmp = new int[arr.length + 1];
        for(int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = num;
        arr = tmp;
    }

    public void clear() {
        arr = new int[0];
    }

    public int size() {
        return arr.length;
    }

    public int remove() {
        int[] tmp = new int[arr.length - 1];
        for(int i=0; i<tmp.length; i++) {
            tmp[i] = arr[i];
        }
        int removeVal = arr[tmp.length];
        arr = tmp;
        return removeVal;
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
