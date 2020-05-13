//PROGRAM FOR EMPTY - CONSTRUCTOR.

class Vehicle{
    
    int Wheels;

    //EMPTY - CONSTRUCTOR: - 
    Vehicle(){
        Wheels = 4;
    }

    public void show(){
        System.out.println("TOTAL WHEELS ARE: - "+Wheels);
    }
}


public class Empty_Constructor{
    public static void main(String[] args) {
        
        Vehicle Car = new Vehicle();
        Car.show();
        // Vehicle Scooty = new Vehicle();
        // Scooty.show();
    }
}