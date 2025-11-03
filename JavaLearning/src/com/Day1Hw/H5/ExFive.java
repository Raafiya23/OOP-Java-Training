package com.Day1Hw.H5;

import java.util.Scanner;

public class ExFive {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.printf("%d is EVEN",num);
        }
        else{
            System.out.printf("%d is ODD",num);
        }
    }
}
