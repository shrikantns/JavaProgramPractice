//Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
//Width1 = 5 , Height1  = 10
package Lab005;
public class main {
    public static void main(String[] args) {
        int Width1 = 5;
        int Height1 = 10;
        float Width  = 5.5F;
        float Height = 8.5f;
        int area1 = Width1 * Height1;
        int perimeter1 = 2 * (Width1+Height1);
        float area = Width * Height;
        float perimeter = 2 * (Width+Height);
        System.out.println("The area of rectangle="+area1);
        System.out.println("The perimeter of rectangle="+perimeter1);
        System.out.println("The area of rectangle="+area);
        System.out.println("The perimeter of rectangle="+perimeter);
    }
}
