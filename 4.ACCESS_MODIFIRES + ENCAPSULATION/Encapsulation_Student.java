//PROGRAM WHICH DESCRIBES THE CONCEPT OF ENCAPSULATION IN JAVA.
import java.util.Scanner;

class Student{
    private String Name;
    private int Age;

    public void Set_Name(String Name){
        this.Name = Name;
    }
    public void Set_Age(int Age){

        if(Age > 0 && Age < 20){
            this.Age = Age;
        }
        else{
            System.out.println("INVALID AGE: ");
        }
    }
    public int Get_Age(){
        return(this.Age);
    }
    public String Get_Name(){
        return(this.Name);
    }
}

public class Encapsulation_Student{
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner (System.in);
        System.out.println("ENTER THE NAME");
        String Name = Sc.nextLine();
        System.out.println("ENTER YOUR AGE:");
        int Age = Sc.nextInt();

          Student S1 = new Student();
          S1.Set_Name(Name);
          S1.Set_Age(Age);
        
        //   System.out.println();
          System.out.println("YOUR DETAILS ARE:");
          System.out.println("NAME: = "+(S1.Get_Name()));
          System.out.println("AGE: = "+(S1.Get_Age()));

          Sc.close();
    }
}