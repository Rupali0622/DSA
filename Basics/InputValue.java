import java.util.Scanner;

public class InputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int value=");
        int a=scanner.nextInt();
        System.out.println("int="+a+"\n");

        System.out.print("Enter String value=");
        String s=scanner.next(); // next only capture string before space
        System.out.println("String="+s+"\n");

        System.out.print("Enter String value=");
        String c=scanner.nextLine(); //nextLine capture complete string
        System.out.println("String="+c+"\n");

        System.out.print("Enter float value=");
        float f=scanner.nextFloat();
        System.out.println("Float="+f+"\n");

        System.out.print("Enter double value=");
        double d=scanner.nextDouble();
        System.out.println("Double="+d+"\n");

        System.out.print("Enter long value=");
        long l=scanner.nextLong();
        System.out.println("long="+l+"\n");

        System.out.print("Enter boolean value=");
        boolean b=scanner.nextBoolean();
        System.out.println("Boolean="+b+"\n");

        System.out.print("Enter short value=");
        short t=scanner.nextShort();
        System.out.println("short="+t+"\n");

        System.out.print("Enter byte value=");
        byte u=scanner.nextByte();
        System.out.println("Byte="+u+"\n");

        scanner.close();
    }
}
