class Human{
    int age;
    String name;

    //System.out.println(age+" : "+name);
    /*In Java, you can’t write statements like System.out.println() directly inside a class (outside any method or block), because the compiler doesn’t know when to run them — only declarations (variables, constructors, methods, etc.) are allowed at that level.*/

    public void show()
    {
    System.out.println(age+" : "+name);
    }

    public Human(){  
        System.out.println("Hi, in constructor");
        age = 22;
        name = "Sakshi";
    }

    public Human(int n, String name){
        System.out.println("Hi, in parametrized constructor");
        age =n;
        this.name = name;
    }

}

public class Constructor {
    public static void main(String[] args) {
        
        Human obj1 = new Human();
        //obj1.show(); //prints null at first bydefault
        //after adding constructor
        Human obj2 = new Human();
        obj1.show();
        obj2.show();

        Human obj3 = new Human(23,"John");
        obj3.show();
    }
}
