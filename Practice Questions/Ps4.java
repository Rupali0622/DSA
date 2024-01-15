import java.util.Scanner;

public class Ps4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number = ");
        int number1=scanner.nextInt();
        System.out.print("Enter second number = ");
        int number2=scanner.nextInt();
        System.out.print("Enter second number = ");
        int number3=scanner.nextInt();

        if((number1>number2) && (number1>number3)){
            System.out.println("Number 1 is greater");
        }else if((number2>number1) && (number2>number3)){
            System.out.println("Number 2 is greater");
        }else{
            System.out.println("Number 3 is greater");
        }
        scanner.close();
    }
}
