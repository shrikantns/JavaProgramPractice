package Lab0026;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {
        //Write a Java program that reads a floating-point number
        // and prints "zero" if the number is zero. Otherwise,
        // print "positive" or "negative".
        // Add "small" if the absolute value of the number is less than 1,
        // or "large" if it exceeds 1,000,000.
        //Test Data
        //Input a number: 25
        //Expected Output :
        //Input value: 25 Positive number
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        double number = sc.nextDouble();
        if (number>0) {
            if (number < 1) {
                System.out.println("Positive Small Number");
            } else if (number > 1000000) {
                System.out.println("Positive large Number");
            } else {
                System.out.println("Positive Number");
            }
        }
        else if (number<0){
                if(Math.abs(number)<1){
                    System.out.println("Negative Small Number");
                }
                else if(Math.abs(number)>1){
                    System.out.println("Negative large Number");
                }
                else {
                    System.out.println("Negative Number");
            }
        }
        else{
            System.out.println("Zero");
        }
    }
}
