class Mobile{
    int price;
    String brand;
    static String name;

    public static void show(Mobile obj){
        //System.out.println(brand+" : "+price+" : "+name);  // cannot use non static variables 
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}

public class StaticMethods {
   public static void main(String[] args) {
    
    Mobile obj1 = new Mobile();
    obj1.price = 10000;
    obj1.brand = "Apple";
    Mobile.name="Smartphone";

    Mobile.show(obj1);
   } 
}
