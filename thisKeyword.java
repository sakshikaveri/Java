class Human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        //Human obj= obj1;
       // name = name;   the parameters only assigns value to itself, instance variable is not initialised
        this.name = name;   //this keyword states for that particular obj only
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    

}


public class thisKeyword {
    public static void main(String[] args) {
        
        Human obj1 = new Human();
        //obj1.name="Sakshi";  // not accessible

        System.out.println(obj1.getName() + " :" + obj1.getAge()); // can be accessed with the help of methods

        obj1.setAge(22);
        obj1.setName("Sakshi");
        System.out.println(obj1.getName() + " :" + obj1.getAge());
    }
}
