package AccessModifiers;

public class A {

    // int number; //cannot be accessed in other package
    // public int number; //now it can be accessed in other package

    protected int number; // can be used in it's own class

    /*public static void main(String[] args) {

        class B extends A {
        }  //same package subclass
        B obj1 = new B();
        System.out.println(obj1.number);
        A obj = new A();
        System.out.println(obj.number);

    }*/

}

        class C{    //same package non subclass
            public static void main(String[] args) {

                        A obj2 = new A();  // as number is in Class A memory
                        System.out.println(obj2.number);
                
            }
        }

