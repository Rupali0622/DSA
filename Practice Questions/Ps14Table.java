import java.util.Scanner;

public class Ps14Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number= ");
        int n=sc.nextInt();
        int Table;
        for(int i=1; i<=10; i++){
            Table=n*i;
            System.out.println(n+" * "+i+" = "+Table);
        }
        
        sc.close();
    }
}
