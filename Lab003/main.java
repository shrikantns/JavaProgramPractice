//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24

package Lab003;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input First Number : ");
        int a = input.nextInt();
        System.out.print("Input Second Number : ");
        int b = input.nextInt();
        int Add = a + b;
        int Sub = a - b;
        int Mul = a * b;
        int Div = a/b;
        int Rem = a%b;
        System.out.println();
        System.out.println("The result: "+Add);
        System.out.println("The result: "+Sub);
        System.out.println("The result: "+Mul);
        System.out.println("The result: "+Div);
        System.out.println("The result: "+Rem);
       // System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n "
    }
}
