import java.util.HashMap;
import java.util.Map;

public class MapInJava {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Sakshi", 50);
        students.put("Saurabh", 60);
        students.put("Vinuta", 90);
        students.put("Vadiraj", 100);

        System.out.println(students); // {Vinuta=90, Vadiraj=100, Sakshi=50, Saurabh=60}

        System.out.println(students.values());
        System.out.println(students.keySet());

        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}
