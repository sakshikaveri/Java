import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetinJava {
    public static void main(String[] args) {

        // Set<Integer> nums = new HashSet<>();
        // for ordered result use Treeset
        Set<Integer> nums = new TreeSet<>();
        nums.add(50);
        nums.add(20);
        nums.add(30);
        nums.add(70);
        nums.add(70);

        // in set we cannot work with indexing, it just doesn't allow duplicate values
        for (int n : nums) {
            // System.out.println(n); // it gives unordered result

        }

    }
}
