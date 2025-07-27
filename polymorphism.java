class A{

    public void displayResult(){
        System.out.println("Hi function from parent class!");
    }
}

// method overriding, runtime polymorphism-- decides on runtime which function to be called 
class B extends A {

    public void displayResult(){
        System.out.println("Hi function from subclass!");
    }
}

class C extends A {
    public void displayResult(){
        System.out.println("Hi function from subclass C!");
    }
}

class polymorphism{
    public static void main(String[] args) {
        A obj = new A();
        obj.displayResult();  // metjod from subclass is called

        A objnew;
        objnew= new B();
        objnew.displayResult();  // will call B class's function

        objnew = new C();
        objnew.displayResult();  // will call C class's function
    }
}
