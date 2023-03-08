package Ejercicios.exercise3;

public interface IPagina {
    void subscription(IUser user, boolean category);
    void removeSubscription(IUser user);
    void notifyVideo(Video video);
    void notifyImage(Image image);
}
