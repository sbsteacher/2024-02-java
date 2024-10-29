package com.green.day14.ch17;

public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        Printable prn1 = (Printable) new Prn204Drv();
        Printable prn2 = new Prn731Drv();

        prn1.print(myDoc);
        System.out.println();
        prn2.print(myDoc);

        //prn1 = prn2;
        System.out.println("--------------");

        Prn204Drv prn204 = (Prn204Drv)prn1;
        //prn204 = (Prn204Drv)prn2;
    }
}

class Prn204Drv implements Printable {

    @Override
    public void print(String doc) {
        System.out.println("FROM MD-204 printer");
        System.out.println(doc);
    }
}

class Prn731Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("FROM MD-731 printer");
        System.out.println(doc);
    }
}