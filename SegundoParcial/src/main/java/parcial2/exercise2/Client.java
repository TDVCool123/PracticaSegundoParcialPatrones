package parcial2.exercise2;

public class Client {
    public static void main(String[]args){
        CuerpoEjercito banco = new CuerpoEjercito();

        banco.orden(new Ordenes("Trabajo","Bloqueos", "Bloqueos en el centro"));


    }
}
