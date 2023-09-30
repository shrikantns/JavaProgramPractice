package ArrayPractice;

import java.util.Arrays;

public class Array0008 {
    public static void main(String[] args) {
        int[] intArr = {10,20,30,22,35};
        Arrays.sort(intArr);
        int intKey = 30;
        System.out.println(intKey+ "Found at index=" +Arrays.binarySearch(intArr,intKey));
    }
}

