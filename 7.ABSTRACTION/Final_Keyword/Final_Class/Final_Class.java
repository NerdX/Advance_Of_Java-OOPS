//PROGRAM WHICH SHOWS THE FINAL - CLASS.
final class A{

    public void SHOWS(){
        System.out.println("HELLO WORLD");
    }
    public void DISPLAY(){
        System.out.println("GOOD MORNING");
    }
}
class B extends A{
    //CAN NOT BE EXTENDED.

    public void SHOWS(){
        System.out.println("WHAT'S UP BUDDY?");
    }
    public void DISPLAY(){
        System.out.println("GOOD NOON");
    }
}

public class Final_Class{
    public static void main(String[] args) {
        B b1 = new B();
        b1.DISPLAY();
        b1.SHOWS();
    }
}