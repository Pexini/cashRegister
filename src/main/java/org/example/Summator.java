package org.example;

public class Summator {
    int result = 0;

    public void add(int price) {
        result += price;
    }

    public void showResult() {
        System.out.println("Сумма чисел равна " + result);
    }
}
