//PROGRAM FOR THE INTODUCTION OF A CLASS.

//CREATE A CLASS CAT: - 
class Cat{

    boolean HasFurr;
    String Breed , Name , Color;
    int Legs;

    public void Walk(){
        System.out.println("CAT IS WALKING");
    }
    public void Eat(){
        System.out.println("CAT IS EATING");
    }
}

class Dog{

    int Legs,Eyes;
    String Breed;

    public void Jump(){
        System.out.println("DOG IS JUMPING");
    }
    public void Eat(){
        System.out.println("DOG IS EATING");
    }

}
//MAIN - CLASS: - 
public class Classes_Objects_Introduction{
    public static void main(String[] args) {

        //CREATE AN OBJECT OF CAT - CLASS: - 
        Cat Cat1 = new Cat();
        Cat1.HasFurr = true;
        Cat1.Breed = "Poodle";
        Cat1.Color = "Brown";
        Cat1.Legs = 4;

        Cat1.Walk();
        Cat1.Eat();

        //CREATE ANOTHER OBJECT: - 
        Cat Cat2 = new Cat();
        Cat2.HasFurr = false;
        Cat2.Breed = "PUSHI";
        Cat2.Color = "Red";
        Cat2.Legs = 3;

        Cat2.Eat();

        //CREATE AN OBJECT OF DOG - CLASS: - 
        Dog D1 = new Dog();
        D1.Breed = "Husky";
        D1.Legs = 4;
        D1.Eyes = 2;

        D1.Jump();
        D1.Eat();

    }
}