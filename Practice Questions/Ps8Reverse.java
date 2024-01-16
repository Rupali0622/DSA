public class Ps8Reverse {
    public static void main(String[] args) {
        int num=12346;
        int rev=0;
        while(num>0){
            int last_digit=num%10;
            rev=(rev*10)+last_digit;
            num=num/10;
        }
        System.out.println("Reverse = "+rev);
    }
}
