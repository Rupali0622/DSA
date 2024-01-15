public class OperatorsInJava{
    public static void main(String[] args) {
        //(1)  Arithmetic operator
        //Binary
        int a=10,b=5;
        int sum=a+b;
        System.out.println("sum= "+sum);
        int sub=a-b;
        System.out.println("sub= "+sub);
        int mul=a*b;
        System.out.println("mul= "+mul);
        float div=a/b;
        System.out.println("div= "+div);
        int mod=a%b;
        System.out.println("mod= "+mod);

        //Unary
        System.out.println("a= "+a);
        //(1)Pre-Increment [First value change then use]
        b=++a;
        System.out.println("post "+b);
        //(2)Post-Increment [First value use then change]
        int c=a++;
        System.out.println("pre "+c);

        //(2)  Relational Operator
        int num1=10;
        int num2=10;
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1>num2);
        System.out.println(num1<num2);

    }
}
