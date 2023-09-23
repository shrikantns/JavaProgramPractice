package PracticeCons;

public class ThisExample {
    //Instance Variable num
    int num = 10;
    ThisExample(){
        System.out.println("Example on Keyword this ");
    }
    ThisExample(int num){
        //Invoking the default Constructor
        this();
        //Assigning the local variable num to the instance variable numb
        this.num = num;
    }
    public void greet(){
        System.out.println("Hi Welcome to Tutorials-point");
    }
    public void print(){
        //Local Variable num
        int num = 20;
        //Printing the local variable
        System.out.println("Local variable num is : "+num);
        //Printing the instance variable
        System.out.println("Instance Variable num is " +this.num);
        //Invoking the greet method of a class
        this.greet();
    }

    public static void main(String[] args) {
        //instantiating the class
        ThisExample obj1 = new ThisExample();
        //Invoking the greet method
        obj1.print();
        //Passing a new value to the num variable through parameterised constructor
        ThisExample obj2 = new ThisExample(30);
        obj2.print();

    }
}
