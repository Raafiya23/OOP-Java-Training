package com.Day6Cw;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        String[] fruits={"Apple","Orange","Banana","Apple","Orange","Banana","Pineapple"};
        Set<String> hs=new HashSet<>();
        for(String temp:fruits){
            hs.add(temp);
        }
        System.out.println(hs);
    }
}
