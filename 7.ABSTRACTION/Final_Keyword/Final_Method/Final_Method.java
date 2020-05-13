//  PROGRAM WHICH SHOWS THE FINAL - METHODS.
class A{

    public void SHOWS(){
        System.out.println("HELLO WORLD");
    }
    final public void DISPLAY(){
        System.out.println("GOOD MORNING");
    }
}
class B extends A{

    public void SHOWS(){
        System.out.println("WHAT'S UP BUDDY?");
    }
    public void DISPLAY(){
        //CAN NOT BE OVERRIDE.
        System.out.println("GOOD NOON");
    }
}

public class Final_Method{
    public static void main(String[] args) {
        
        B b1 = new B();
        b1.DISPLAY();
        b1.SHOWS();
    }
}