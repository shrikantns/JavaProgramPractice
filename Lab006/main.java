package Lab006;

import java.util.Scanner;

public class main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side1: ");
        int side1 = input.nextInt();
        System.out.print("Enter the side2: ");
        int side2 = input.nextInt();
        System.out.print("Enter the side3: ");
        int side3 = input.nextInt();
        if(side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        }
            else  if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isolate Triangle");
            }
                else {
                System.out.println("Scalen Triangle");
            }
            }
        }

