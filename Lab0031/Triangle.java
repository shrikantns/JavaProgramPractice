package Lab0031;

public class Triangle {
    public static void main(String[] args) {
        int n = 8;
        for (int i=-1;i<=n;i++) {
            i=i+1;
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}