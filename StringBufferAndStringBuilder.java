public class StringBufferAndStringBuilder {

    public static void main(String[] args) {
        
        //Strings are immutable- cannot be changed
        //Solution for this can be StringBuffer or StringBuilder with help of which strings can be mutable

        StringBuffer sb = new StringBuffer("Sakshi");
        System.out.println(sb.capacity());  //16+6, stringbuffer offers 16 buffer size default to avoid problem of relocation due to shortage of space
        System.out.println(sb.length());
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);
        String name = sb.toString();
        System.out.println(name);


    

    }
}
