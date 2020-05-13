//PROGRAM WHICH DESCRIBES THE SINGLETON - CLASS/PATTERN IN JAVA.

class AppConfig{

    //STEP:1
    private AppConfig(){

        //PRIVATE - CONSTRUCTOR:
    }

    //STEP:2
    private static AppConfig obj = new AppConfig();
    //STEP:2(OPTIMIZED)
    // private static AppConfig obj = null;

    //STEP:3
    public static AppConfig getInstance(){
        return(obj);
    }

    // STEP:3(OPTIMIZED).
    
    // public static AppConfig getInstance(){
    //     if(obj == null){
    //     obj = new AppConfig();
    //     }
    //     return(obj);
    // }

    public void Show(){

        System.out.println("SINGLETONE CLASS IS IMPLEMENTED:)");
    }

}

public class SingleTon_Class{
    public static void main(String[] args) {
       
        AppConfig Object = AppConfig.getInstance();
        Object.Show();
    }
}