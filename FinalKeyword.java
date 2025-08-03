

//final keyword for variable,method and class
class Owner{

    public void show(){
        System.out.println("This is a confidential function created by the owner!");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class Duplicate extends Owner{
    //Cannot override the final method from Owner
    public void show(){
        System.out.println("This is a confidential function created by the duplicate!");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        /*Owner firstobj = new Owner();
        firstobj.add(10,10);
        firstobj.show();*/

        Duplicate obj = new Duplicate();
        obj.add(5,10);
        obj.show();
    }
}
