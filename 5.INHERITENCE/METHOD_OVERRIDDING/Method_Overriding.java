//PROGRAM WHICH DESCRIBES THE CONCEPT OF METHOD - OVERRIDING IN JAVA.
 class A{
     public void Show(){
         System.out.println("I'M IN BASE CLASS");
     }
     public static void Display(){
         System.out.println("HELLO WORLD");
     }
 }
 class B extends A{
     public void Show(){
         System.out.println("I'M IN CHILD CLASS");
     }
     public static void Display(){
         System.out.println("GOOD MORNING");
     }
 }

public class Method_Overriding{
    public static void main(String[] args) {
        
        A A1 = new A();
        A1.Show();

        B B1 = new B();
        B1.Show();

        A.Display();
        B.Display();

        // System.out.println(A1 instanceof A);
        // System.out.println(A1 instanceof B);
        
    }
}