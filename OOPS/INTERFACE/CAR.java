package OOPS.INTERFACE;

public class CAR implements Engine,Brake{
    @Override
    public void start(){
        System.out.println("I am stop");
    }
    @Override
    public void stop(){
        System.out.println("I am start");
    }
    @Override
    public void accelerate(){
        System.out.println("I am accelerate");

    }
    @Override
    public void brake(){
        System.out.println("I am brake");

    }

}
