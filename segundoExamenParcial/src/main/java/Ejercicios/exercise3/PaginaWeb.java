package Ejercicios.exercise3;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPagina {
    private String name;
    private String description;
    private List<IUser> suscriptorList = new ArrayList<>();
    private List<Video> videoList = new ArrayList<>();
    private List<Image> imageList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void uploadVideo(Video newVideo) {
        this.videoList.add(newVideo);
        this.notifyVideo(newVideo);
    }


    public void uploadImage(Image newImage){
        this.imageList.add(newImage);
        this.notifyImage(newImage);
    }

    @Override
    public void subscription(IUser user, boolean reciveNotification) {
        user.setReciveNotification(reciveNotification);
        suscriptorList.add(user);
    }

    @Override
    public void removeSubscription(IUser user) {
        suscriptorList.remove(user);
    }

    @Override
    public void notifyVideo(Video video) {
        for (IUser suscriptor:suscriptorList) {
            if (suscriptor.getReciveNotification())
                suscriptor.updateVideo("La pagina: ["+name+"] subio un nuevo video: \n", video);
        }
    }

    @Override
    public void notifyImage(Image image) {
        for (IUser suscriptor:suscriptorList) {
            if (suscriptor.getReciveNotification())
                suscriptor.updateImage("La pagina: ["+name+"] subio una imagen: \n", image);
        }
    }
}
