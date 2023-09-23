package Lab0033;

public class StringProgram {
    public static void main(String[] args) {

        String S1 = "Hello";
        String S2 = "Hello";
        String S3 = new String("hello");
        System.out.println(S1 == S2);
        System.out.println(S2 == S3);
        System.out.println(S1.equals(S3));
        System.out.println();
    }
}
