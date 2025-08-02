import AccessModifiers .*;

class B extends A{
public static void main(String[] args) {
    A obj = new A();
    //System.out.println(obj.number); // for accessing non static variable we have to create an object cannot be accessed directly
}
}

