//PROGRAM FOR THE INTRODUCTION OF CONSTRUCTORS IN JAVA.

class Demo{

    //DEFINING THE CONSTRUCTOR: - 
    Demo(){
        System.out.println("THE OBJECT IS CREATED OF DEMO - CLASS");
    }
    public void Show() {
        System.out.println("HELLO WORLD");
    }
}

public class Constructor_Introduction{
    public static void main(String[] args) {
        Demo D1 = new Demo();  
        D1.Show();      
    }
}