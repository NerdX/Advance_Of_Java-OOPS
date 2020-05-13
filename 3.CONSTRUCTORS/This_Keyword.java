//PROGRAM FOR THIS - KEYWORD IN JAVA.

class Vehicles{

    int Wheels;
    int HeadLights;

    //DEFINING CONSTRUCTOR: - 
    Vehicles(int Wheels){

        //THIS - KEYWORD:
        this.Wheels = Wheels;
    }

    public void Show(){
        System.out.println("TOTAL WHEELS ARE: - "+Wheels);
    }
}

public class This_Keyword{
    public static void main(String[] args) {
        Vehicles Car = new Vehicles(4);
        Car.Show();
    }
}