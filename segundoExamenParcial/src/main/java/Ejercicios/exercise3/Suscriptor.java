package Ejercicios.exercise3;

public class Suscriptor implements IUser {

    private String name;
    private boolean reciveNotification;
    public Suscriptor( String name) {

        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void updateVideo(String message, Video video) {
        System.out.println(">>>>>>>>>>> notification <<<<<<<<<<<<<");
        System.out.println("name: "+name);

        System.out.println("recibir notificaion: "+reciveNotification);
        System.out.println(message);
        video.showInfo();
        System.out.println("---------------------------------------------------");
    }

    @Override
    public void updateImage(String message, Image image) {
        System.out.println(">>>>>>>>>>> notification <<<<<<<<<<<<<");
        System.out.println("name: "+name);

        System.out.println("recibir notificaion: "+reciveNotification);
        System.out.println(message);
        image.showInfo();
        System.out.println("---------------------------------------------------");
    }



    @Override
    public void setReciveNotification(boolean reciveNotification) {
        this.reciveNotification=reciveNotification;
    }

    @Override
    public boolean getReciveNotification() {
        return reciveNotification;
    }
}
