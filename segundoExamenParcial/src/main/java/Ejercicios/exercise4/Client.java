package Ejercicios.exercise4;

public class Client {
    public static void main(String []args){

        DataBase dataBase = new DataBase("TecnoSell");
        dataBase.addEstudiante(new Estudiante(123564,"Erika","19/10/2002","Comercial"))
                .addEstudiante(new Estudiante(1556489,"Camila","26/11/2000","Derecho"))
                .addEstudiante(new Estudiante(84322,"Joseph","11/11/2001","Sistemas"))
                .addEstudiante(new Estudiante(651231,"Luis","29/08/2001","Sistemas"))
                .addEstudiante(new Estudiante(195632,"Ines","21/12/2004","Arquitectura"));

        String orderType="CI";

        // condicion para saber cual es la mejor estrategia a usar

        if (orderType.equals("CI")){
            dataBase.setStrategyAlgorithm(new CIBurbuja());
        }else{
            dataBase.setStrategyAlgorithm(new NameMontículos());
        }

        dataBase.ordenar();
    }
}
