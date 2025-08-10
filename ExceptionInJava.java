public class ExceptionInJava {
    public static void main(String[] args) {

        // System.out.Println("Hello"); //compile time exception-->The method
        // Println(String) is undefined for the type PrintStream
        int i = 9;
        int j = 0;

        try {
            j = 8 / i;
            //here we get j as zero, if we don't want j as zero and want to throw exception for same we can use throw keyword allowing to create a custom error.
            throw new ArithmeticException("Value cannot be zero");
        }
        catch (ArithmeticException e){
            j=10;  //handling the exception
            System.out.println("This is arithmetic exception catch block->"+e);
        }

        catch (Exception e) {
            System.out.println("Customised main class exception message " + e);
        }
        System.out.println(j);
        System.out.println("Outside of try catch!");
    }
}
