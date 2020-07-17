package com.Mtn;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte YEARLY = 12;
        final byte PERCENT = 100;
        System.out.println("This is a Mortgage Calculator 2020");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n What is the Prinical?");
        int principal = scanner.nextInt();

        System.out.println("\n What is the Annual Interest Rate?");
        float annualIR = scanner.nextFloat();
        float monthlyIR = annualIR/ PERCENT / YEARLY;

        System.out.println("\n How many years are needed to fully pay off the loan?");
        byte loanYrs = scanner.nextByte();
        int numberOfPayments = loanYrs * YEARLY;

        double mortgage = principal
                * (monthlyIR * Math.pow(1 + monthlyIR, numberOfPayments))
                / (Math.pow(1 + monthlyIR, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\n\t Mortgage Payment per month would be \n\t" + mortgageFormatted);
    }
}
