package Ejercicios.exercise3;

public interface IUser {
    void updateVideo(String message, Video video);
    void updateImage(String message, Image image);
    void setReciveNotification(boolean reciveNotification);
    boolean getReciveNotification();
}
