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


//method overloading, compile time polymorphism-- when we give parameters at that time only decided 

class D extends A{
    public void displayResult(int a){
        System.out.println("Hi function from subclass D! "+a);
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

        D object = new D();
        int num = 5;
        object.displayResult(num);  // will call D class's function
        object.displayResult();     // will call A class's function
    }
}
