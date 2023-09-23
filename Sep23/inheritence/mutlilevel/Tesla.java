package Sep23.inheritence.mutlilevel;

public class Tesla extends Car{

    public Tesla(int i) {
        super(i); // super -> Car?
    }

    @Override
    void topspeed(){
        System.out.println("I am Tesla!!");
    }
}
