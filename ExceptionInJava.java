public class ExceptionInJava {
    public static void main(String[] args) {

        // System.out.Println("Hello"); //compile time exception-->The method
        // Println(String) is undefined for the type PrintStream
        int i = 4;
        int j = 0;
        int nums[] = new int[3];
        String name = null;

        try {
            j = 8 / i;
            System.out.println(nums[1]);
            //System.out.println(nums[3]);
            System.out.println(name.length());
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
