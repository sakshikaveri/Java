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

            //Concept of stack and heap in strings
            String lastName = "navin" ;  //one object value in heap(String constant pool) with a address
            lastName = lastName+" reddy"; // lastname doesn't get changed a new object is created in pool with different address for  navin reddy
            System.out.println(lastName);
            //String new_lastName = lastName+" reddy";
            //System.out.println(lastName==new_lastName);  // will come false

            String s1 = "Navin";
            String s2 = "Navin";
            //both will have same addresses as only one object is created for Navin(as when s1 was created Navin got stored in pool and when s2 was created as Navin was already present in pool no new object with different address was created)

            System.out.println(s1==s2);  // will come true

            //the lastname= navin object will be then eligible for garbage collection
    }


}


