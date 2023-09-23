package Lab0033;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Length {
    public static void main(String[] args) {
        String Str = "pramoddutta";
        System.out.println(Str.length());
        System.out.println(Str.charAt(0));
        System.out.println(Str.charAt(9));
        System.out.println(Str.chars());
        System.out.println(Arrays.toString(Str.getBytes(StandardCharsets.UTF_8)));
        System.out.println(Str.toLowerCase());
        System.out.println(Str.toUpperCase());
        System.out.println(Str.contains("pra-mode"));
    }
}
