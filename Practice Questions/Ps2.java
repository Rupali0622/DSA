import java.util.Scanner;

public class Ps2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number = ");
        int number1=scanner.nextInt();
        System.out.println("Enter second number");
        int number2=scanner.nextInt();

        if(number1>number2){
            System.out.println("First number is greater");
        }else{
            System.out.println("Second number is greater");
        }
        scanner.close();
    }
}
