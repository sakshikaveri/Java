

//final keyword for variable,method and class
final class Owner{
    //to avoid subclasses from inheriting parent class and all its features we can make the entire class final
    public void show(){
        System.out.println("This is a confidential function!");
    }
}

//will give error- The type Duplicate cannot subclass the final class Owner
class Duplicate extends Owner{

}

public class FinalKeyword {
    public static void main(String[] args) {
        Duplicate obj = new Duplicate();
        obj.show();
    }
}
