//PROGRAM WHICH SHOWS THE ACCESS - MODIFIRES IN JAVA.
import java.util.Scanner;
class User{
    Scanner Sc = new Scanner(System.in);
    private String UserId;
    private String Password;

    public void GET_DATA(String Id, String Pwd){
        UserId = Id;
        Password = Pwd;
    }

    public void LOGIN(){
            System.out.println("ENTER YOUR ID:");
            String ID = Sc.nextLine();
            System.out.println("ENTER YOUR PASSWORD");
            String PD = Sc.nextLine();

            if(ID.equals(UserId) && PD.equals(Password)){
                System.out.println("LOGIN SUCCESSFULLY IN SYSTEM");
            }
            else{
                System.out.println("SOMETHING WENT WRONGE!");
            }

            Sc.close();

    }


}

public class Access_Modifires{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER YOUR DETAILS:");
        System.out.println("CREATE USERID:");
        String UID = Sc.nextLine();
        System.out.println("MAKE YOUR SUITABLE PASSWORD");
        String PWD = Sc.nextLine();

        User U1 = new User();
        U1.GET_DATA(UID, PWD);

        System.out.println("YOU WANT TO LOGIN INTO THE SYSTEM ?");
        String D = Sc.nextLine();
        if(D.equals("YES") || D.equals("yes")){
            U1.LOGIN();
        }
        if(D.equals("NO") || D.equals("no")){
            System.out.println("BYE - BYE");
            System.exit(0);
        }
        else{
            System.out.println("BYE - BYE");
        }
        Sc.close();
    }
}