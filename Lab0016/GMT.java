//Write a Java program that prints the current time in GMT.
//Test Data
// Input the time zone offset to GMT: 128
// Expected Output:
// Current time is 21:40:15

package Lab0016;
import java.util.Scanner;
public class GMT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = sc.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
