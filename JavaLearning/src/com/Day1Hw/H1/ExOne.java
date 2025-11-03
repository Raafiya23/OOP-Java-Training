package com.Day1Hw.H1;

public class ExOne {
    public static void main(String[] args){
        if(args.length!=2) {
            System.out.println("Please enter two command line arguments");
            return;
        }

        String company = args[0];
        String location = args[1];
        System.out.println(company+" Technologies "+location);

    }
}
