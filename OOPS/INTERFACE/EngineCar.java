package OOPS.INTERFACE;

public class EngineCar implements Engine,Brake{
    @Override
    public void stop(){
        System.out.println("Engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine accelerate");
    }

    @Override
    public void start() {
        System.out.println("Engine start");
    }

    @Override
    public void brake() {
        System.out.println("Engine Brake");
    }
}
