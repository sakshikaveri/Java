public class TypeConversionCasting {
    public static void main(String[] args) {
        
        //Integer
        //Conversion(implicit)
        int a =10;
        byte b = 5;
        //a=b;  //storing byte in integer  -- will work

        //casting(explicit conversion)
        b=(byte)a;
        System.out.println(b);  // converts a into a modulo and divides it by the range of byte i.e 10%256= remainder=10

        //float
        float f = 4.8f;
        int x = (int)f;  // will loose the after decimal point values
        System.out.println(x);

        //type promotion
        byte d = 10;
        byte c = 30;

        int result = d*c; //a*b will give 300 which is out of range hence java does type promotion so result can be stored in int
        System.out.println(result);

    }
}
