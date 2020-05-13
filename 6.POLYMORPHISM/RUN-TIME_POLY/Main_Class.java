//PROGRAM WHICH EXPLAINS THE CONCEPT OF RUN-TIME POLYMORPHISM.
class Pet{

    String Name = "Dobby";

    public void Walk(){
        System.out.println("PET IS WALKING");
    }

}
class Dog extends Pet{

    String Name = "Miles";

    public void Walk(){
        System.out.println("DOG IS WALKING");
    }

}

public class Main_Class{
    public static void main(String[] args) {
        
        Dog Husky = new Dog();
        Pet P1 = Husky;//UPCASTING.

        Husky.Walk();
        P1.Walk();

        System.out.println(P1.Name);
        System.out.println(Husky.Name);
    }
}