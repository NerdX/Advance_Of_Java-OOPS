//PROGRAM WHICH EXPLAINS THE CONCEPT OF COMPILE-TIME POLYMORPHISM.
public class Compile_Time_Poly{
    public static void main(String[] args) {

        Show();
        Show("GOOD MORNING");
        Show("HI THERE",3);
        
    }

    public static void Show(){
        System.out.println("HELLO WORLD");
    }

    public static void Show(String S){
        System.out.println(S);
    }

    public static void Show(String S , int N){
        for(int i=0 ; i<N ; i++){
            System.out.println(S);
        }
    }
}