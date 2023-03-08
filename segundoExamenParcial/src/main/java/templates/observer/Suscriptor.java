package templates.observer;

public class Suscriptor implements IUser{
    private String ci;
    private String name;
    private boolean reciveNotification;
    public Suscriptor(String ci, String name) {
        this.ci = ci;
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message, Video video) {
        System.out.println(">>>>>>>>>>> notification <<<<<<<<<<<<<");
        System.out.println("name: "+name);
        System.out.println("ci: "+ci);
        System.out.println("recibir notificaion: "+reciveNotification);
        System.out.println(message);
        video.showInfo();
        System.out.println(">>>>>>>>>>>              <<<<<<<<<<<<<");
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
