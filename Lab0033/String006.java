package Lab0033;

public class String006 {
    public static void main(String[] args) {

        String S1 ="Dutta";
        //for (int i=0; i<1000;i++) {
            //S1 = S+S1;
        //}
        StringBuilder sb = new StringBuilder("Pramod");

        //Use String Buffer when values changes a log
        // Less time and Thread Safety

        sb.append(S1.repeat(1000));

    }
}
