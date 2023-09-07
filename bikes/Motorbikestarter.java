package bikes;

public class Motorbikestarter {
    public static void main(String[] args){
        Motorbike bmw = new Motorbike(100);
        Motorbike ducati = new Motorbike(0);
        bmw.start();
        ducati.start();

        //bmw.setSpeed(100);
        System.out.println(bmw.getSpeed());

        //ducati.setSpeed(0);
        System.out.println(ducati.getSpeed());

        bmw.increaseSpeed(10);
        ducati.increaseSpeed(150);
        
        System.out.println(bmw.getSpeed());
        System.out.println(ducati.getSpeed());

        bmw.decreaseSpeed(10);
        ducati.decreaseSpeed(10);
        System.out.println(bmw.getSpeed());
        System.out.println(ducati.getSpeed());


    }
}
