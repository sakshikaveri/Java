public class ExceptionInJava {
    public static void main(String[] args) {

        // System.out.Println("Hello"); //compile time exception-->The method
        // Println(String) is undefined for the type PrintStream
        int i = 0;
        int j = 0;
        int nums[] = new int[3];

        try {
            j = 8 / i; // runtime exception--> java.lang.ArithmeticException: / by zero
            System.out.println(nums[1]);
            System.out.println(nums[3]);
        }
        catch (ArithmeticException e){
            System.out.println("This is arithmetic exception catch block->"+e);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This array index out of bounds exception->"+e);

        }
        catch (Exception e) {
            System.out.println("Customised main class exception message " + e);
        }
        System.out.println(j);
        System.out.println("Outside of try catch!");
    }
}
