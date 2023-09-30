package PracticeCons;

public class ConstructorParaDemo {
    int x;
    ConstructorParaDemo(int i) {
        x = i;
        System.out.println("This is a constructor value:" + x);
    }

    public static void main(String[] args) {
        ConstructorParaDemo t1 = new ConstructorParaDemo(10);
        ConstructorParaDemo t2 = new ConstructorParaDemo(20);
        System.out.println(t1.x + " " + t2.x);
    }
}