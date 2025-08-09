interface One { // interfaces have by default public abstract methods and no concrete methods
    void show();

    void show2();

    //all variables in interfaces are public static final and need to be intialized 
    int age =22; 
    String name="Sakshi";
}
 
class Two implements One {

    public void show() {
        System.out.println("show function");
    }

    public void show2() {
        System.out.println("show2 function");
    }

}

public class interfaceClasses {
    public static void main(String[] args) {
        One obj = new Two();
        obj.show();
        obj.show2();
    }
}
