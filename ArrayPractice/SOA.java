package ArrayPractice;

public class SOA {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 9, 9, 8};
        int sum = 0;
        for (int j : arr1) sum += j;
        double average = (double) sum / arr1.length;
        System.out.println("sum of array values : " + sum);
        System.out.println("Average array values : " + average);
    }
}
