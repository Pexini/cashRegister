package org.example;

public class Main {
    public static void main(String[] args) {
        Summator summatorOne = new Summator(1);

        summatorOne.add(10);
        summatorOne.add(5,10);

       summatorOne.showResult();

       Summator summatorTwo = new Summator(new int [] {3,4});
       summatorTwo.add(5);
       summatorTwo.showResult();

    }
}