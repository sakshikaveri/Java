class Information {
    private int age;
    private String name;
    // both can be accessed within class

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }
}

public class encapsulation {

    public static void main(String[] args) {

        Information obj1 = new Information();

        // obj1.age=22; //cannot be accessed
        System.out.println(obj1.getName() + " :" + obj1.getAge()); // can be accessed with the help of methods

        obj1.setAge(22);
        obj1.setName("Sakshi");
        System.out.println(obj1.getName() + " :" + obj1.getAge());
    }
}
