package Lab0012;

import java.util.Scanner;

public class Converttemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double Far = (int) sc.nextDouble();
        double celsius =(( 5 *(Far - 32.0)) / 9.0);
        System.out.println();
        System.out.println("Degree: " +celsius);

    }
}
