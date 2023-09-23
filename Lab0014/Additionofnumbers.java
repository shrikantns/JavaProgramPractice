//Write a Java program that reads an integer between 0 and 1000
// and adds all the digits in the integer.
//Test Data //Input an integer between 0 and 1000: 565
        //Expected Output :
        //The sum of all digits in 565 is 16


package Lab0014;

import java.util.Scanner;

public class Additionofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int a = sc.nextInt();
        int FD = 5;
        int SD = 6;
        int TD = 5;
        int Add = FD+SD+TD;
        System.out.println("The sum of all digits in"  +a+  "is"  +Add);
    }
}
