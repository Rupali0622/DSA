public class JavaBasics{
    public static void main(String[] args) {
        int number1=10;
        // int number2=5;
        // int sum=number1+number2;
        // System.out.println("Sum = "+sum);

        //upper part
        for(int i=1; i<=number1; i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower part
        for(int i=number1-1; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}