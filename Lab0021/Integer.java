//Test Data
        //Input 1st integer: 25
        //Input 2nd integer: 5
        //Expected Output :
        //Sum of two integers: 30
        //Difference of two integers: 20
        //Product of two integers: 125
        //Average of two integers: 15.00
        //Distance of two integers: 20
        //Max integer: 25
        //Min integer: 5

package Lab0021;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int a = sc.nextInt();
        System.out.print("Input 2nd integer: ");
        int b = sc.nextInt();
        int Sum = a + b;
        int difference = a - b;
        int Product = a * b;
        int i = 2;
        double Average = (double) Sum / i;
        int distance = a - b;
        int VI = a;
        int BI = b;
        System.out.println("Sum of two integers : " +Sum);
        System.out.println("Difference of two integers: " +difference);
        System.out.println("Product of two integers: " +Product);
        System.out.println("Average of two integers: " +Average);
        System.out.println("Difference of two integers: " +distance);
        System.out.println("Difference of two integers: " +VI);
        System.out.println("Difference of two integers: "+BI);


        //System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        //System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        //System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        //System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
        //System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
        //System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
        //System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));

    }
}