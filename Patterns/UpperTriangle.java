package Patterns;

import java.util.Scanner;

public class UpperTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //loop for lines
        for(int i=1; i<=n; i++){                                //* * * * * * * * *
            //loop for space                                        * * * * * * *
                for(int j=1; j<=i; j++){                         //   * * * * *
                    System.out.print("  ");                    //     * * *
                }                                               //        *
            //loop for starts
                for(int j=i; j<=n; j++){
                    System.out.print(" *");
                }
                for(int j=i; j<=n-1; j++){
                    System.out.print(" *");
                }
            System.out.println();
        }
        sc.close();
    }
}
