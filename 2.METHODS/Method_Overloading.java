//PROGRAM FOR THE CONCEPT OF METHOD - OVERLOADING IN JAVA: - 
public class Method_Overloading{
    public static void main(String[] args) {

        Add(25, 30);
        Add(3.24, 2.73);
        Add(3.67890123, 4.5671249);
        Add();
    }
    
    private static void Add() {
        System.out.println("NO FU*CKING ADDITION IS PERFORMED HERE!");
    }
    static void Add(int X, int Y) {
        int Z = (X + Y);
        System.out.println("THE ADDITION OF TWO INTEGERS: - "+Z);
    }
    static void Add(float M, float N){
        float Q = (M + N);
        System.out.println("THE ADDITION OF TWO FLOATS: - "+Q);
    }
    static void Add(double A , double B){
        double C = (A + B);
        System.out.println("THE ADDITION OF TWO DOUBLES: - "+C);
    }
}