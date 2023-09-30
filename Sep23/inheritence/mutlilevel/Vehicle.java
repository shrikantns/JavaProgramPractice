package Sep23.inheritence.mutlilevel;

public class Vehicle {
    int seats;
    String engineType;
    int speed;
    Vehicle(int speed) {
        this.speed = speed;

    }
    void topspeed(){
        System.out.println("Top Speed" + this.speed);
    }
  
}
