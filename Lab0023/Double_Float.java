package Lab0023;

public class Double_Float {
    public static void main(String[] args) {
        double dn1 = 0.000213456321d;
        boolean d1f = Double.isFinite(dn1);
        double dn2 = dn1 / 0;
        boolean d2f = Double.isFinite(dn2);
        double dn3 = Double.POSITIVE_INFINITY * 0;
        boolean d3f = Double.isFinite(dn3);
        System.out.println("\nFinite doubles\n--------------");
        System.out.println("Is "+dn1 + " is finite? " + d1f);
        System.out.println("Is "+dn2 + " (dn1/0) is finite? " + d2f);
        System.out.println("Is "+dn3 + " is finite? " + d3f);
        float fn1 = 5.3f;
        boolean f1f = Float.isFinite(fn1);
        float fn2 = fn1 / 0;
        boolean f2f = Float.isFinite(fn2);
        float fn3 = 0f / 0f;
        boolean f3f = Float.isFinite(fn3);
        System.out.println("\n\nFinite floats\n-------------");
        System.out.println("Is "+fn1 + " is finite? " + f1f);
        System.out.println("Is "+fn2 + " (fn1/0) is finite? " + f2f);
        System.out.println("Is "+fn3 + " is finite? " + f3f);
    }
}
