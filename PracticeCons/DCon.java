package PracticeCons;

public class DCon {
  int a , b ,c ;
    DCon(){
        a = 20;
        b = 30;
        c = 50;
    }
    DCon(int a){
        this();
        this.a = a;
    }
        public static void main(String[] args) {
        DCon L1 = new DCon();
        DCon L2 = new DCon();
        DCon L3 = new DCon();
        DCon L4 = new DCon(40);
        System.out.println("This is Default number " +L1.a +" "+ L2.b + " "+L3.c);
        System.out.println("This is Parameterized number "+L4.a);
    }
}
