package Ejercicios.exercise4;

import java.util.List;

public class NameMontículos implements IStrategyAlgorithm {
    @Override
    public void algoritmo(List<Estudiante> estudiantes) {

        System.out.println("\n Usando algoritmo de Monticulos");

        for (Estudiante estudiante :estudiantes){

            System.out.println(estudiante.getName());
            System.out.println("-------------------------------------------\n");

        }


    }
}
