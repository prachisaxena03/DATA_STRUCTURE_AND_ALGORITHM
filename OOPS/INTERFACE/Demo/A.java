package OOPS.INTERFACE.Demo;

public interface A {
    default void fun(){
        System.out.println("I'm the default one");
    }
    static void run(){
        System.out.println("hi everyone" );
    }
}
