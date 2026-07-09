package ObjectCloning;

public class human {
    int age;
    String name;
    human(){
        this.age=25;
        this.name="prachi";
    }
    human(human other){
        this.age=other.age;
        this.name=other.name;
    }
    public human clone() throws CloneNotSupportedException{
        return (human) super.clone();
    }
}
