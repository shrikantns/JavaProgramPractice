package Lab0031;

import java.util.Scanner;
public class PascalsTriangle {

    // Write a Java program to display Pascal's triangle.
    //Test Data //Input number of rows: 5
    //Expected Output ://Input number of rows: 5
    //1
    //1 1
    //1 2 1
    //1 3 3 1
    //1 4 6 4 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = sc.nextInt();
        for (int i = rows; i <= rows; i++) {
            for (int spc = rows +1; spc < 0; spc++) {
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

}