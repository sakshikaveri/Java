class Hello
{
    public static void main (String a[]){
        System.out.print("Hello");

        int number = 125;
        //float decimal = 5.8;  //will give error, as double is default in java and it's aiming for a double datatype
        float decimal = 5.8f; //won't give error

        double double_Decimal = 5.8; //won't give error

        char character = 'a';

        boolean boolean_word = true;

        // the values are called literals
        
        //literals with diff formats
        //binary
        int num = 0b01;
        System.out.println(num);

        //hexadecimal
        int hex = 0x61;
        System.out.println(hex);

        //underscore
        int underscore_number = 10_00_000;
        System.out.println(underscore_number);
    }
}