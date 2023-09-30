package Lab0024;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        //Write a Java program to get a number from the user and print whether it is positive or negative.

//                Test Data
  //      Input number: 35
    //    Expected Output :
      //  Number is positive
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = sc.nextInt();
        if (number>0)
        {
            System.out.println("Number is positive");
        }
        else if (number<0)
        {
            System.out.println("Number is negative");
        }

    }
}
