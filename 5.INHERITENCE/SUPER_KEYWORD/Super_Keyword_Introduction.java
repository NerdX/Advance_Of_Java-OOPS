//PROGRAM WHICH DESCRIBES THE SUPER - KEYWORD IN JAVA.

class Person{

    protected String Name;

    public void Eat(){
        System.out.println(Name + " " + "IS EATING");
    }
    public void Walk(){
        System.out.println(Name + " " + "IS WALKING");
    }
    public void Show(){
        System.out.println("HELLO WORLD");
    }
}
 class Teacher extends Person{
    public void Teach(){
        System.out.println(Name + " " + "IS TEACHING");
        super.Show();
    }
    
 }
 class Singer extends Person{
    public void Sing(){
        System.out.println(Name + " " + "IS SINGING");
        super.Show();
    }
 }

public class Super_Keyword_Introduction{
    public static void main(String[] args) {
        
        Teacher T1 = new Teacher();
        T1.Name = "ANUJ SIR";
        T1.Eat();
        T1.Walk();
        T1.Teach();

        System.out.println();

        Singer S1 = new Singer();
        S1.Name = "MAROON5";
        S1.Eat();
        S1.Walk();
        S1.Sing();

    }
}