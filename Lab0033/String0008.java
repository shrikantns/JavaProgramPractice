package Lab0033;

import java.util.Scanner;

public class String0008 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String Sb2 = Sc.nextLine();
        //StringBuffer Sb1 = new StringBuffer(Sb2);
        StringBuilder Sb1 = new StringBuilder(Sb2);
        Sb1.reverse();
        System.out.println(Sb1);
    }
}

