package com.Day6Cw;

/*
Hashset is a class implementing set interface
Heterogenous data are allowed
Duplicates are not allowed
single null value
won't maintain insertion order

 */
/*
 * 1. Declaration
 * 2. Adding Elements
 * 3. Printing HashSet
 * 4. Printing size
 * 5. Remove specific value
 * 6. Inserting Element
 * 7. Accessing specific element
 * 8. Alternative method to access the specific element
 * 9. Read all the elements
 * 10. clear all elements
 * 11. check whether the hashset is empty
 */

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
//     HashSet set=new HashSet<>();
        Set<String> hs=new HashSet<>();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Banana");
        hs.add("Strawberry");
        System.out.println(hs.size());
        hs.remove("Banana");
        System.out.println(hs);
        Set<String> fruits=new HashSet<>();
        fruits.add("Blueberry");
        fruits.add("Pineapple");
        hs.addAll(fruits);
        System.out.println(hs);

        List<String> list=new ArrayList<>(hs);
        System.out.println(list.get(2));
        for(String temp:hs){
            System.out.println(temp);
        }

        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
