package Ejercicios.exercise4;

public class Estudiante {
    private int ci;
    private String name;
    private String fechaNaciemiento;
    private String carrera;

    public Estudiante(int ci, String name, String fechaNaciemiento, String carrera) {
        this.ci = ci;
        this.name = name;
        this.fechaNaciemiento = fechaNaciemiento;
        this.carrera = carrera;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(String fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void print() {
        String tmp =  "Estudiante{" +
                "ci='" + ci + '\'' +
                ", Nombre:'" + name + '\'' +
                ", Fecha de nacimiento='" + fechaNaciemiento + '\'' +
                ", Carrera='" + carrera + '\'' +
                '}';
        System.out.println(tmp);
    }
}
