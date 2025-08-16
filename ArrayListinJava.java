import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListinJava {
    public static void main(String[] args) {

        // Collection<Integer> nums = new ArrayList<Integer>();
        // If we want to work with indexing we should use List instead of collection
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(10);
        nums.add(50);
        nums.add(70);
        // nums.add("Sakshi"); //will give error as we have specified the type

        // Type mismatch: cannot convert from element type Object to int, if we have not
        // added the type in declaration
        for (int n : nums) {
            // System.out.println(n);
        }

        System.out.println(nums.indexOf(50));
        System.out.println(nums.get(2));

    }
}
