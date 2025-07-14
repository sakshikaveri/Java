package Inheritance;

public class Demo {
    
    public static void main(String[] args) {
        
        /*Calc obj1 = new Calc();
        obj1.add(3,5);
        obj1.sub(10,5);*/

        AdvanceCalc obj2 = new AdvanceCalc();
        //obj2.add(4,5);// will give error

        int r1= obj2.add(8,9);
        int r2= obj2.sub(10,5);
        int r3=obj2.multi(5,5);
        int r4=obj2.div(10, 2);

        System.out.println(r1+" "+r2+" "+r3+" "+r4);

    }
}
