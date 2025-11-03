package com.Day1Hw.H4;

import java.util.Scanner;

public class ExFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.printf("The number %d is ZERO", num);
        }
        else if(num>0){
            System.out.printf("The number %d is POSITIVE", num);
        }
        else{
            System.out.printf("The number %d is NEGATIVE", num);
        }
    }
}
