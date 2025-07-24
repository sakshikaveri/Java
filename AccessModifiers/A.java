package AccessModifiers;

public class A {

    // int number; //cannot be accessed in other package
    // public int number; //now it can be accessed in other package

    private int number; // can be used in it's own class


    public static void main(String[] args) {

            class B extends A{
            B obj = new B();
           // System.out.println(obj.number);  // will give error as number can be used only in class A and not in class B
    }
            A obj = new A();
            System.out.println(obj.number);
}

}
