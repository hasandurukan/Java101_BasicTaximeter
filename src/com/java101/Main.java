package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minimumPrice = 20;
        int initialPrice = 10;
        double pricePerKm = 2.2;
        double distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Please type distance as kilometer :");
        distance = input.nextDouble();
        double totalPrice = initialPrice + (pricePerKm * distance);
        totalPrice = totalPrice < 20 ? 20 : totalPrice;
        System.out.print("Total price is " + totalPrice);
    }
}
