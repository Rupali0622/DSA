package Patterns;

import java.util.Scanner;

public class Inverted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of lines in Pattern= ");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
