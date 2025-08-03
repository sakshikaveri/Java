class Objects{
    String model;
    int price;

    public void show(){
        System.out.println(model + " "+price);
    }

    public String toString(){
        return model+" "+price;
    }

    public boolean equals(Objects that){
        return this.model.equals(that.model) && this.price == that.price;  // will noe return true because we customised the equals function by comparing the values
    }
}

public class ObjectClassMethods {
    public static void main(String[] args) {
        Objects obj = new Objects();
        obj.model="Lenovo: Yoga";
        obj.price = 10000;

        Objects obj2 = new Objects();
        obj2.model="Lenovo: Yoga";
        obj2.price = 10000;

        //System.out.println(obj.toString());  //Objects@722c41f4  calls toString() methods
        System.out.println(obj.toString());
        System.out.println(obj.equals(obj2));  //false because bydefault equals method is called and it compares objects with hashcode values
    }
}
