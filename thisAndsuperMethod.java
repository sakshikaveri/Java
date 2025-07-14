class A extends Object {

    public A() {
        super(); // it's bydefault present in every class
        System.out.println("In A default constructor");
    }

    public A(int n) {
        System.out.println("in A parametirized const with number " + n);
    }
}

class B extends A {

    public B() {
        // super();
        super(10);
        System.out.println("In b default constructor");
    }

    public B(int n) {
        // super(); //calls class A's default constructor
        //super(n); // calls A's param constructor

        this(); // this method calls the constructor of the same class
        System.out.println("In b parameterized const with number " + n);
    }
}

public class thisAndsuperMethod {
    public static void main(String[] args) {
        // B obj = new B(); // calls default const of subclass B and super class A
       // B obj1 = new B(5); // calls param const of sublass B
        B obj2 = new B(6);

    }

}
