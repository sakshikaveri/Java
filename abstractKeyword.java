abstract class Car {
    public abstract void drive();  //abstract method must be implemented in abstract class
    public void playMusic(){
        System.out.println("Playing music!!");
    }
    public abstract void fly();
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("Driving..");

    }
}

class UpdatedWagonR extends WagonR{  
    public void fly(){
        System.out.println("Flying..");
    }
}

//abstract subclasses should inherit all abstract methods from parent class
public class abstractKeyword {
    public static void main(String[] args) {
        //Car obj = new WagonR();  //object of abstract class cannot be created
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }

}
