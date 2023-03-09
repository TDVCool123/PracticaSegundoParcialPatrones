package Ejercicios.exercise3;

public interface IPagina {
    void subscription(IUser user, boolean category);
    void notifyVideo(Video video);
    void notifyImage(Image image);
}
