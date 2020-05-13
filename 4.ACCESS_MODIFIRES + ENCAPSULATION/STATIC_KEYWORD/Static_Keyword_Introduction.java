//PROGRAM WHICH DESCRIBES THE STATIC-KEYWORD IN JAVA.
class A{

    static int A = 20;

     public static void Get(int X){
         System.out.println("THE VALUE OF X = "+X);
         System.out.println("THE VALUE OF A = "+A);
     }

}

public class Static_Keyword_Introduction{
    public static void main(String[] args) {
      System.out.println(A.A);
        System.out.println("HELLO WORLD");
        A.Get(1000);
    }
}