
abstract class Animals{

    protected String Name;

    public abstract void MakeSound();

    public void Sleep(){
        System.out.println(Name + " " + "Is Sleeping Now!");
    }
}

class Pig extends Animals{

        @Override
        public void MakeSound(){
            System.out.println("Wee - Wee !");
        }
}

class Cat extends Animals{

        @Override
        public void MakeSound(){
            System.out.println("Miau - Miau !");
        }
}

public class Abstraction_Ex2{
    public static void main(String[] args) {

        Pig P1 = new Pig();
        P1.Name = "Dobby";
        P1.MakeSound();
        P1.Sleep();

        Cat C1 = new Cat();
        C1.Name = "Tom";
        C1.MakeSound();
        C1.Sleep();
        
    }
}