package Lab0031;

public class UltaTriangle {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            for (int spc = n - i; spc > 0; spc--){
                System.out.print(" ");
            }
                for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
