package calling_constructor_with_other_constructor;

public class Motorbike {
    private int speed;

    Motorbike(){
        this(5);
    }
    Motorbike(int a){
        this.speed = a;
    }
    void getSpeed(){
        System.out.println(speed);
    }
}
