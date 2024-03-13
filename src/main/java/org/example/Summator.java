package org.example;

public class Summator {


    public Summator(int number) {
        result += number;
    }

    public Summator(int[] number) {
        for (int i = 0; i < number.length; i++) {

            result += number[i];
        }
    }

    int result = 0;
    public void add(int price) {
        result += price;
    }
    public void add(int price, int number) {
        result += price * number;
    }
    public void showResult() {
        System.out.println("Сумма чисел равна " + result);
    }
}
