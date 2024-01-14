public class DataTypes {
    public static void main(String[] args) {

        // Primitive data type
        
        byte a=10;              //1 byte (-128 to 127)
        System.out.println("Byte="+a);
        short b=10;             //2 byte (-32768 to -32767)
        System.out.println("short="+b);
        char c='a';             //2 byte (a-z, A-Z, @, %)
        System.out.println("char="+c);
        boolean isPass=true;    //1 byte (true/false)
        System.out.println("boolean="+isPass);
        long e=10;              //8 byte
        System.out.println("long="+e);
        float f=10.0f;          //4 byte
        System.out.println("float="+f);
        double g=10.2;          //8 byte
        System.out.println("double="+g);

        // Non-Primitive data type

        String str="Rupali";    //String
        System.out.println("String ="+str);
        int arr[]=new int[5];   //Array
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println("array="+arr[0]);
                                //class
                                //object
                                //interface
    }
}
