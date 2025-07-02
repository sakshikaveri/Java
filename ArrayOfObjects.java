
class Student{

    //instance variables 
    int age;
    String name;
}

public class ArrayOfObjects{

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.age = 22;
        s1.name = "Sakshi";

        Student s2 = new Student();
        s2.age = 54;
        s2.name="Monica";

        Student students[] = new Student[2];  //here you're not creating array of objects of class Student you've to define objects manually and then store them in array of type "yourclass".
        students[0] = s1;
        students[1] = s2;

        for(int i=0;i<students.length;i++){
            System.out.println("Name:"+students[i].name+" Age:"+students[i].age);
        }

        //enhanced for loop(for-each loop) -- pros(no issue of exception)
        for(Student stud : students){
            System.out.println(stud.name +" : "+stud.age);
        }
    }
}