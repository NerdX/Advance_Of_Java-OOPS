//PROGRAM WHICH EXPLAINS THE CONCEPT OF ABSTRACTION IN JAVA.
abstract class  Car{

    abstract public void Acc();
    abstract public void Breaking();

}

class Hyundai extends Car{

    @Override
    public void Acc(){
        System.out.println("Hyundai Is Accelrate.");
    }

    @Override
    public void Breaking(){
        System.out.println("Hyundia Is Breaking.");
    }
}

class Audi extends Car{
    
    @Override
    public void Acc(){
        System.out.println("Audi Is Accelrate.");
    }
    
    @Override
    public void Breaking(){
        System.out.println("Audi Is Breaking.");
    }
}

//public class Car_Repair_Shop{}
public class Abstraction_In_Java{

    public static void Repair(Car C1){
        System.out.println("Car Is Repaired.");
    }
    
    public static void main(String[] args) {
        
        Hyundai hyundai = new Hyundai();
        Audi audi = new Audi();

        Repair(hyundai);
        Repair(audi);
    }
}