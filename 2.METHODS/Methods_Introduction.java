//PROGRAM FOR THE INTODUCTION OF METHODS IN JAVA.
public class Methods_Introduction{
    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int C = Max_Of_Two(A, B);
        System.out.println("MAX = "+C);
        SayHi();
        
    }
    static int Max_Of_Two(int X, int Y){

        if(X > Y){
            return(X);
        }
        else{
            return(Y);
        }
    }
    static void SayHi(){

        System.out.println("HI THERE! GOOD MORNING");
    }

}