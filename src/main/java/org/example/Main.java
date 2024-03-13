package org.example;

public class Main {
    public static void main(String[] args) {
        Summator summator = new Summator();
        summator.add(10);
        summator.add(15);
        summator.add(20);
        summator.add(25);

       summator.showResult();
    }
}