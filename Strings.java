public class Strings {
    public static void main(String[] args) {
        
/* String is not a primitive datatype(name starts with capital) it's a class
 
*/
        
        String name = new String();  //original method of writing (as string is a class)
        System.out.println(name);  //empty(no value assigned to object)
        String first_name = new String("Sakshi");
        System.out.println(first_name+" "+"kaveri");

        //some methods of class string
        System.out.println(first_name.hashCode());
        System.out.println(first_name.charAt(3));
        System.out.println(first_name.concat("Kaveri"));
    }
}
