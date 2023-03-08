package templates.observer;

public interface IUser {
    void update(String message, Video video);
    void setReciveNotification(boolean reciveNotification);
    boolean getReciveNotification();
}
