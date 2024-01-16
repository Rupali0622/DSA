import java.util.Scanner;

public class Ps9Break {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do{
                int num=sc.nextInt();
                if(num%10==0){
                    break;
                }
            }while(true);
        }
    
    }
}
