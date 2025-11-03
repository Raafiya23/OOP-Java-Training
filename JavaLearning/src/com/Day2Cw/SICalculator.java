package com.Day2Cw;

import java.util.Scanner;

public class SICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principle, rate, time, SI;
        System.out.print("Enter Principle amount: ");
        principle = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        time = sc.nextDouble();

        SI = (principle * rate * time) / 100;

        System.out.println("\n---- Simple Interest Details ----");
        System.out.println("Principal: " + principle);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + SI);
    }
}
