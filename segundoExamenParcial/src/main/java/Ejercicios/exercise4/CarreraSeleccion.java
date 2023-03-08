package Ejercicios.exercise4;

import java.util.List;

public class CarreraSeleccion implements IStrategyAlgorithm {
    @Override
    public void algoritmo(List<Estudiante> equipo) {

        System.out.println("\n Usando algoritmo de Seleccion");

        for (Estudiante estudiante :equipo){

            System.out.println(estudiante.getCarrera());
            System.out.println("-------------------------------------------\n");

        }


    }
}
