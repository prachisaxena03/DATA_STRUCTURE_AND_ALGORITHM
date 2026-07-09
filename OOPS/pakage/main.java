package pakage;

public class main {
    public static void main(String[] args) {
        Human Prachi=new Human(21,"Prachi",15000,false);
        Human Yudita=new Human(20,"yudita",20000,true );
        System.out.println(Prachi.name);
        System.out.println(Prachi.age);
        System.out.println(Prachi.population);
        System.out.println(Yudita.population);
        fun();
        main fi=new main();
        fi.fin();
    }
    static void fun(){

        main greet=new main();
        greet.greeting();
    }
    void greeting(){
        System.out.println("Hello everyone");
    }
    void fin(){
        greeting();
    }
}
