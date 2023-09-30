package Lab0029;

import java.util.Scanner;

public class Weekdayname {
    public static void main(String[] args) {

        //Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

        // Test Data
        //Input number: 3
        //Expected Output :
        //Wednesday

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number : ");
        int day = sc.nextInt();
        System.out.println(getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName;
        dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day range";
        };

        return dayName;
    }
}