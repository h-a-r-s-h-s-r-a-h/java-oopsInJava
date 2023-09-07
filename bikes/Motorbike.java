package bikes;

public class Motorbike {
    private int speed ; // speed is member variable

    //constructor
    Motorbike(int speed){
        this.speed = speed;
    }

    void setSpeed(int a){  // a is local variable // setters
        if (a>0)
            this.speed = a;
    }
    int getSpeed() {    // getters
        return this.speed;
    }
    void start(){
        System.out.println("Bike Started");
    }
    void increaseSpeed(int how_much){
        this.speed = this.speed + how_much;
    }
    void decreaseSpeed(int how_much){
        setSpeed(this.speed - how_much);
    }
}
