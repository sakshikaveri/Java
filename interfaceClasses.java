abstract class One {  //abstract class can have concrete methods and abstract methods both
    public abstract void show();

    public abstract void show2();

    public void show3(){
        System.out.println("Concrete method!!");
    }
}


//but we are facing problem we have to create a class to only define the inherited methods in order to use 
class Two extends One {

    public void show() {
        // TODO Auto-generated method stub
    }

    public void show2() {
        // TODO Auto-generated method stub
    }

}

public class interfaceClasses {
    public static void main(String[] args) {

        // One obj = new One(); //will give error--Cannot instantiate the type One
        One obj = new Two();
        obj.show();
        obj.show2();
    }
}
