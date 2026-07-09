package OOPS;

public class ClassConstructor {
    public static void main(String[] args) {
        Student ps=new Student();
//        ps.name="Prachi";
        System.out.println(ps);
        Student rs=new Student(15,"radha",36.5f);
//        System.out.println(rs.name);
//        System.out.println(rs.marks);
//        System.out.println(rs.roll);
        Student kr=new Student(rs);
//        System.out.println(kr.name);
//        System.out.println(kr.marks);
//        System.out.println(kr.roll);
        System.out.println(rs.name);
        System.out.println(rs.roll);
        
//        System.out.println(ps.name);
    }

}
class Student{
    int roll;
    String name;
    float marks;
    Student (){
        //internally:new Student(13,"default name",56.1f);
        this(13,"default name",56.1f);
    }
    Student (int ro,String name,float marks){
        this.roll=ro;
        this.name=name;
        this.marks=marks;
    }
    Student (Student other){
        this.roll=other.roll;
        this.name=other.name;
        this.marks=other.marks;
    }

}

