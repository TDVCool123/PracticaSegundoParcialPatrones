package Ejercicios.exercise4;

import java.util.List;

public class NameMontículos implements IStrategyAlgorithm {
    @Override
    public void algoritmo(List<Estudiante> equipo) {


        for (Estudiante estudiante :equipo){

            System.out.println("\n Usando algoritmo de Monticulos");
            System.out.println(estudiante.getName());
            System.out.println("-------------------------------------------\n");

        }


    }
}
