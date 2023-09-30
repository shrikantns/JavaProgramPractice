package Lab007;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first Alphabet Number : ");
        double a = input.nextDouble();
        System.out.print("Input your second Alphabet Number : ");
        double b = input.nextDouble();
        boolean c = a < b;
        System.out.println();
        System.out.println("The Result :");
    }
}
