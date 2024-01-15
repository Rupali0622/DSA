public class OperatorsInJava{
    public static void main(String[] args) {
        //(1) Arithmetic operator
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

        //(2) Relational Operator
        int num1=10;
        int num2=10;
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1>num2);
        System.out.println(num1<num2);

        //(3) Logical Operator
        int n=10;
        int m=5;
        System.out.println((m<n) && (m!=n)); //Print true if both conditions are true
        System.out.println((m<n) && (n<m)); //Print False if one of condition is false or both false
        System.out.println((m<n) || (n>m)); //Print true if one conditions is true or both true
        System.out.println((m==n) || (n<m)); //Print false if both the conditions are false
        System.out.println(!(m!=n));

        //(4) Assignment Operator
        int x=10;
        int y=5;
            y+=x;
        System.out.println(y);
            y-=x;
        System.out.println(y);
            y*=x;
        System.out.println(y);
            y/=x;
        System.out.println(y);
            y%=x;
        System.out.println(y);
    }
}
