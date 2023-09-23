package Lab0032;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        //Write a Java program to display the multiplication table of a given integer.
        //Test Data
        //Input the number (Table to be calculated) : Input number of terms :5
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number (Table to be calculated) :");
        int n = sc.nextInt();
        System.out.println("\n");
        for (j = 0; j <= n; j++)
        {
            System.out.println(n+" X "+j+" = " +n*j);
        }

    }
}
