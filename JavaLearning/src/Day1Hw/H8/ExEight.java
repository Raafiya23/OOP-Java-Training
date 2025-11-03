package Day1Hw.H8;

import java.util.Scanner;

public class ExEight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch+" is Alphabet");
        }
        else if (ch>='0' && ch<='9'){
            System.out.println(ch+" is Digit");
        }
        else{
            System.out.println(ch+" is Special Character");
        }
    }
}
