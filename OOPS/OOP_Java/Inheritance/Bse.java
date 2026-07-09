package OOP_Java.Inheritance;

public class Bse {
    int l;
    int b;
    int h;
    Bse(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }
    Bse(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    Bse(Bse old){
        this.l=old.l;
        this.b=old.b;
        this.h=old.h;
    }
}
