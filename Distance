//Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

        //Test Data
        //Input distance in meters: 2500
       // Input hour: 5
       // Input minutes: 56
        //Input seconds: 23
        //Expected Output :
        //Your speed in meters/second is 0.11691531
        //Your speed in km/h is 0.42089513
        //Your speed in miles/h is 0.26158804

package Lab0018;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        float totalseconds;
        float mps , kmphh , mph;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        float distance = sc.nextFloat();
        System.out.print("Input hour: ");
        float hour = sc.nextFloat();
        System.out.print("Input minutes: ");
        float minutes = sc.nextFloat();
        System.out.print("Input seconds: ");
        float seconds = sc.nextFloat();
        totalseconds = (hour*3600)+(minutes*60)+seconds;
        mps = distance/totalseconds;
        kmphh = mps*3.6f;
        mph = kmphh/1.609f;
        System.out.println(" Your speed in meters/second is " +mps);
        System.out.println(" Your speed in km/h  " +kmphh);
        System.out.println(" Your speed in miles/h  " +mph);
    }
}
