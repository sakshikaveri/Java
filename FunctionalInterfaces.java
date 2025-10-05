@FunctionalInterface
  // will only have one abstract method, cannot be called directly, need to be called by classes or anonymous inner class
interface A{
    void show();
}
class Main {
    public static void main(String[] args) {
        A obj = new A() 
        { 
            public void show(){
            System.out.println("Hi in show method");}
            
        };
        obj.show();
    }
}
