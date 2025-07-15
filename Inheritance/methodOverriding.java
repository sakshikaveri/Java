package Inheritance;

class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalc extends Calc{

    //same method name as of parent class's method
    public int add(int num1, int num2){
        return num1+num2+1;
    }

}


public class methodOverriding {
    
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int result = obj.add(4,3);
        System.out.println(result);
    }
}
