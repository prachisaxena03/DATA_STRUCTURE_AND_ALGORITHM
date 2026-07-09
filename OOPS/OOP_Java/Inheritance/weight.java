package OOP_Java.Inheritance;

public class weight extends Bse{
    double w;
    weight(){
        super();
        this.w=-1;
    }
    weight(int l,int b,int h,double w){
        super( l, b, h);
        this.w=w;
    }
    weight(weight old){

        this.w=old.w;
    }
}
