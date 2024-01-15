public class ConditionalStatements {
    public static void main(String[] args) {
        //if statement
        int num=2;
        int num2=4;
        if(num!=num2){
            System.out.println("true");
        }

        //if else statement
        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        //if-else if statement
        float per=75.5f;
        if((per<100) && (per>=80)){
            System.out.println("A");
        }else if((per<80) && (per>=70)){
            System.out.println("B");
        }else if((per<70) && (per>60)){
            System.out.println("C");
        }else{
            System.out.println("D");
        }

        //Ternary Operator
        int number=28;
        String result=(number%5==0)? "multiple of 5":"not a multiple of 5";
        System.out.println(result);

        //Switch Statement
        int c=2;
        switch (c) {
            case 1:System.out.println("Sunday");
                break;
            case 2:System.out.println("Monday");
                break;
            case 3:System.out.println("Tuesday");
                break;
            default:System.out.println("Not valid");
                break;
        }
    }
}
