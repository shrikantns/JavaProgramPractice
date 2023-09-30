package ArrayPractice;

import org.jetbrains.annotations.NotNull;

public class Array0006 {

// Java program to demonstrate
// passing of array to method
public static void main(String[] args) {
    int[] arr = {1,2,3,4,9};
    sum(arr);
}
public static void sum(@NotNull int[] arr)
{ int sum =0;
    for (int i = 0 ; i < arr.length;i++)
        sum += arr[i];
    System.out.println("sum of array values : "+sum);
}
}