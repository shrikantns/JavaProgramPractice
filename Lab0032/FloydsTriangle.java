package Lab0032;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {

        //Write a Java program to print Floyd's Triangle.
        //
        //Test Data
        //Input number of rows : 5
        //Expected Output :
        //
        //Input number of rows :  5
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows :");
        n = sc.nextInt();
        int n1 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n1 + " ");
                n1++;
            }
            System.out.println();
        }
    }
}
