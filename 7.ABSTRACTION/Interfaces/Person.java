//PROGRAM WHICH EXPLAINS THE CONCEPT OF INTERFACES IN JAVA.

abstract interface Student{

    abstract void Study();

}

abstract interface Youtuber extends VideoEditor{

    abstract void MakeVideo();
}

abstract interface VideoEditor{

    abstract void EditVideo();

    default void UploadVideo(){
        System.out.println("UPLOADING THE VIDEOS");
    }

}

public class Person implements Student , Youtuber{
    public static void main(String[] args) {

        Person P1 = new Person();
        P1.Study();
        P1.MakeVideo();
        P1.EditVideo();
        P1.UploadVideo();

        //UPCASTING
        Youtuber Y1 = P1;
        Y1.MakeVideo();
        Y1.EditVideo();
        Y1.UploadVideo();
        
    }

    @Override
    public void Study() {
        System.out.println("PERSON IS STUDYING");

    }

    @Override
    public void MakeVideo() {
        System.out.println("PERSOR IS MAKING A VIDEO");
    }

    @Override
    public void EditVideo() {
        System.out.println("PERSON IS EDITING A VIDEO");

    }
}

/*WHAT IF WE DON'T WANT TO IMPLEMENT ALL THE METHODS:
public abstractd class Person implements Student , Youtuber*/