//PROGRAM FOR PARAMETERIZED - CONSTRUCTOR IN JAVA.

class Vehicles{

    int Wheels;
    int HeadLights;

    //DEFINING CONSTRUCTOR: - 
    Vehicles(int NoOfWheels){
        Wheels = NoOfWheels;
        HeadLights = 2;
    }

    public void Show(){
        System.out.println("TOTAL WHEELS ARE: - "+Wheels);
        System.out.println("THE HEADLIGHTS ARE: - "+HeadLights);
    }
}

public class Parameterized_Constructor{
    public static void main(String[] args) {
        Vehicles Car = new Vehicles(4);
        Car.Show();

        Vehicles Scooty = new Vehicles(2);
        Scooty.Show();
    }
}