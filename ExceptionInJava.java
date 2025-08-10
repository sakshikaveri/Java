
//if you know this line would throw exception then you can use throws keyword like i know this will throw exception but i would not handle it let my manager handle it as he's calling me
class Demo {
    public void showClassName() throws ClassNotFoundException {
        Class.forName("Sakshi");
    }
}

public class ExceptionInJava {
    public static void main(String[] args) {

        /*
         * checked exception-- would give error if class doesnt exist
         * try {
         * Class.forName("Sakshi");
         * } catch (ClassNotFoundException e) {
         * e.printStackTrace();
         * }
         */

        Demo obj = new Demo();
        try {
            obj.showClassName();
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find class " + e);
        }

    }
}
