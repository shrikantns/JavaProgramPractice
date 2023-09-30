package PracticeCons;

public class ConstructorDemo {
    int x;
    int y;
    ConstructorDemo(){
        x =10;
        y =20;
    }

    public static void main(String[] args) {
        ConstructorDemo t1 = new ConstructorDemo();
        ConstructorDemo t2 = new ConstructorDemo();
        System.out.println(t1.x + " " + t2.x);
        System.out.println(t1.y + "*" +t2.y);
    }

}