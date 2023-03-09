package Ejercicios.exercise4;

import java.util.List;

public class CarreraSeleccion implements IStrategyAlgorithm {
    @Override
    public void algoritmo(List<Estudiante> estudiantes) {

        System.out.println("\n Usando algoritmo de Seleccion");

        for (Estudiante estudiante :estudiantes){

            System.out.println(estudiante.getCarrera());
            System.out.println("-------------------------------------------\n");

        }


    }
}
