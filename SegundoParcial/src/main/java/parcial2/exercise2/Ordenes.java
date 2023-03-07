package parcial2.exercise2;

public class Ordenes {
    private String titulo;
    private String tipo;
    private String descripcion;

    public Ordenes(String titulo, String tipo, String des) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.descripcion = des;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void showInfo(){
        System.out.println("severidad:"+ tipo);
        System.out.println("titulo:"+ titulo);
        System.out.println("descripcion:"+ descripcion);
    }
}
