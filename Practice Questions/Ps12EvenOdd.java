import java.util.Scanner;

public class Ps12EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        System.out.print("Enter number");
        int number=sc.nextInt();
        for(int i=1; i<=number; i++){
            if(i%2==0){
                even=even+i;
            }else{
                odd=odd+i;
            }
        }
        System.out.println("Sum oF even="+even);
        System.out.println("Sum of Odd="+odd);
        sc.close();
    }
}
