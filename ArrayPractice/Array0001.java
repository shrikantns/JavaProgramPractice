package ArrayPractice;

public class Array0001 {
    public static void main(String[] args) {
        // declares an Array of integers.
        int[] arr;
        //allocating memory for 5 intergers
        arr = new int[6];
        //initialize  the first elements of the array
        arr[0] = 10;
        //// initialize the first elements of the array
        // initialize the second elements of the array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : " + arr[i]);
    }
}


