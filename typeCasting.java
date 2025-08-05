class A{
    public void show1(){
        System.out.println("In show1 A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In show2 B");
    }
}

public class typeCasting {
    public static void main(String[] args) {
        
        //Upcasting
        A obj = new B();
        obj.show1(); //reference of A

        //downcasting-- can be used when going from parent class to super class reference conversion
        //B obj1 = obj;  //Type mismatch: cannot convert from A to B
        B obj1 = (B) obj;
        obj1.show2();
    }
}
