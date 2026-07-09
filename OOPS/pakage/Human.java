package pakage;

public class Human {
    int age;
    String name;
    long salary;
    boolean married;
    static long population;
    static void greeting(){
        System.out.println("hello world");
    }
    public Human(int age,String name,long salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;

    }
}
