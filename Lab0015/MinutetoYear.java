        //Test Data
        //Write a Java program to convert minutes into years and days.
        //Input the number of minutes: 3456789
        //Expected Output :
        //3456789 minutes is approximately 6 years and 210 days

package Lab0015;

        import java.util.Scanner;

        public class MinutetoYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double minutes = sc.nextDouble();
        long year = (long) (minutes / 525600);
        long day = (long) (minutes / 1440);
        System.out.println((int) minutes + " minutes is approximately " + year + " years and " + day + " days");
    }
}
