package Ejercicios.exercise3;

public class Image {
    private String id;
    private String titulo;

    public Image(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void showInfo() {
        System.out .println("Imagen{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                '}');
    }
}
