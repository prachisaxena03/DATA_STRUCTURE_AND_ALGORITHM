package OOPS.ENUM;

public class Main {
    enum day{
        Monday,tuesday,wednesday,thrusday,friday,sataurday
    }

    public static void main(String[] args) {
        day d=day.Monday;
        for(day da:day.values()){
            System.out.println(da);
        }
    }
}
