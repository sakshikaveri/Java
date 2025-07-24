import AccessModifiers.*;

public class Demo_accessmod {
    
    public static void main(String[] args) {
    A OBJ1 = new A();
    //System.out.println(OBJ1.number);  //it's not accessible as number is in other package's class.
    System.out.println(OBJ1.number);  //cannot be accessed as the number is private
    }


}
