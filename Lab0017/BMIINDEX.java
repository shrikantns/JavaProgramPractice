
//Write a Java program to compute the body mass index (BMI).
//Test Data
//Input weight in pounds: 452
//Input height in inches: 72
//Expected Output:
//Body Mass Index is 61.30159143458721


package Lab0017;
import java.util.Scanner;
public class BMIINDEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in pounds:");
        double weight = sc.nextDouble();
        System.out.print("Input height in inches:");
        double height = sc.nextDouble();
        double BMI1 = 703;
        double square = height*height;
        double BMI3 = BMI1*(weight/square);
        System.out.println(" Body Mass Index is " +BMI3+ "\n");
    }
}
