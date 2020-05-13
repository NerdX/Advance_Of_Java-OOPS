//PROGRAM WHICH DESCRIBES THE STATIC_BLOCKS IN JAVA.

public class Static_Blocks{

    static{
        System.out.println("STATIC BLOCK : 1");
    }

    public static void main(String[] args) {
        System.out.println("INSIDE MAIN METHOD");
    }

    static{
        System.out.println("STATIC BLOCK : 2");
    }

    static{
        System.out.println("STATIC BLOCK : 3");
    }
    
    static{
        System.out.println("BYE-BYE !");
    }
}