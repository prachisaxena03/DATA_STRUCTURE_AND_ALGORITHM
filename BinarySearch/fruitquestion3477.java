package BinarySearch;

public class fruitquestion3477 {
    public static void main(String[] args) {
        int[] fruit={2,4,6};
        int[] basket={5,6,2};
        int result=fruitsintobasket(fruit,basket);
        System.out.println(result);
    }
    public static int fruitsintobasket(int[] fruits,int[] basket){
        int unplaced=0;
        boolean[] used=new boolean[basket.length];
        boolean placed=false;
        for(int fruit=0;fruit<fruits.length;fruit++){

            for(int j=0;j<basket.length;j++){
                if(fruit<=basket[j]&&!used[j]){
                    placed=true;
                    used[j]=true;
                    break;
                }
            }

            }
        if(placed){
            unplaced++;
        }
        return unplaced;
    }


}
