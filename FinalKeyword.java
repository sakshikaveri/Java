

//final keyword for variable,method and class
class Owner{
    final String name = "Sakshi";
}

class Duplicate extends Owner{

}

public class FinalKeyword {
    public static void main(String[] args) {
        int num = 10;
        num=11;
        System.out.println(num);  // will change value of num, if not required then use final keyword
        final int newNumber = 11;
        //newNumber = 12;   // will give error, cannot be changed
        System.out.println(newNumber);

        Owner obj = new Owner();
        //obj.name="Kaveri";  // will give error
        System.out.println(obj.name);
    }
}
