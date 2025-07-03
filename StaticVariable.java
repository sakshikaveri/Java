class Mobile{
    //instance variables
    int price;
    String brand;
    static String name;
    //can make name static as price and brand might differ obj to obj but name remains same, name is class point of view not object pov
    //name defined is shared by all objects

    //variables defined inside method are local variables
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);  //static variables can be used in non static methods
    }
}

class Car{
    int price;
    String brand;
    static String vehicle;

    public Car(){
        price = 150000;
        brand = "";
        System.out.println("Inside CAR constructor");
        //vehicle="car";  // no need to write it in constructor as it's a static variables whenever obj is instantiated constructor is called and variables are instantiated, don't need that for tatic variable
    }

    static{
        vehicle ="car";
        System.out.println("inside static block");  // only gets instantiated when class loads
    }
}

public class StaticVariable {
    public static void main(String[] args) throws ClassNotFoundException {
        
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=100000;
        //obj1.name ="Smartphone";  // should be written as classname.staticVariable
        Mobile.name="Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=2000000;
        //obj2.name ="Smartphone";

        Mobile.name = "Android";  //both obj1 and obj2 will have name as Android
        obj1.show();
        obj2.show();

        Car objCar = new Car();  // whenever obj is created constructor is called and instance variables are initiated
        System.out.println(objCar.price);

        Car newobjCar = new Car();

        //if no objects are created static and constructor both are not called hence,
        Class.forName("Car");  // used for loading class


    }
}
