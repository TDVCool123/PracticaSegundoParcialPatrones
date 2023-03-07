package parcial2.exercise1;

public class Tesis {

    private String name;

    private String redaccion;


    public Tesis(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public String getRedaccion() {
        return redaccion;
    }



    public Tesis setName(String name) {
        this.name = name;
        return this;
    }



    public Tesis setRedaccion(String redaccion) {
        this.redaccion = redaccion;
        return this;
    }



    public void showInfo(){
        System.out.println("*************");
        System.out.println("name: "+name);

        System.out.println("Redactar: "+ redaccion);

        System.out.println("************");
    }
}
