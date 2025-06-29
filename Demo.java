
class Calculate{
    // behavior 
    public int addNumbers(int n1, int n2){
        return n1+n2;
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        //calc is reference variable and {new Calculate} creates a new obj of type Calculate 
        Calculate calc = new Calculate();
        int result = calc.addNumbers(num1,num2);
        System.out.println("Result-->"+result);
    }
}
