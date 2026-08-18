class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n&&s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<n&&s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<n&&s.charAt(i)=='+'){
            i++;
        }
        return solve(s,i,sign,0);
    }
    public int solve(String s,int i,int sign,int num) {
        if(i==s.length()||!Character.isDigit(s.charAt(i))){
            return num*sign;
        }
        int digit=s.charAt(i)-'0';
        if(num>Integer.MAX_VALUE/10||(num==Integer.MAX_VALUE/10&&digit>7)){
            if(sign==1){
            return Integer.MAX_VALUE;

            }else{
                return Integer.MIN_VALUE;
            }
        } 
        return solve(s,i+1,sign,num*10+digit);
    }
}
