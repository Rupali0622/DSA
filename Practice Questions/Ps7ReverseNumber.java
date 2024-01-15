public class Ps7ReverseNumber {
    public static void main(String[] args) {
        int num=12345;
        
        int newnum=0;
        while(num>0){
            int mod=num%10;
             newnum=mod;
             num=num/10;
             System.out.print(newnum);
        }
        
    }
}
