//PROGRAM WHICH SHOWS THE CONSTRUCTOR - OVERLOADING IN JAVA.

class Vehicles{

    int Wheels;
    int HeadLights;
    String Color;

    //DEFINING THE CONSTRUCTORS: - 
    Vehicles(int Wheels){
        this.Wheels = Wheels;
        Color = "BLACK";
        HeadLights = 2;
    }

    Vehicles(int Wheels, String Color){
        this.Wheels = Wheels;
        this.Color = Color;
        HeadLights = 2;
    }

    public void Show(){
        System.out.println("TOTAL WHEELS ARE:"+Wheels);
        System.out.println("COLOR IS:"+Color);
        System.out.println("THE HEADLIGHTS ARE:"+HeadLights);
    }
    
}
public class Constructor_Overloading
{
    public static void main(String[] args) {
        
        Vehicles Car1 = new Vehicles(4);
        Car1.Show();

        Vehicles Scooty = new Vehicles(2);
        Scooty.Show();

        Vehicles Car2 = new Vehicles(4, "GREY");
        Car2.Show();
        
        Vehicles Rikshaw = new Vehicles(3, "YELLOW");
        Rikshaw.Show();
    }
}