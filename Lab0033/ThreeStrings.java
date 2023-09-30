package Lab0033;

public class ThreeStrings {
    public static void main(String[] args) {
        //Strings are immutable in nature

        String Str1 = "Hello";
        String Str2 = "Guys";
        String Str3 = "Hello Guys";
        String Str4 = Str1.concat(Str2);
        System.out.println(Str3);
        System.out.println(Str4);

    }
}
