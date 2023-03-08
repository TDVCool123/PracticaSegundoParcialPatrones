package Ejercicios.exercise4;

import java.util.List;

public class CIBurbuja implements IStrategyAlgorithm {
    @Override
    public void algoritmo(List<Estudiante> equipo) {

        System.out.println("\n Usando algoritmo de Burbuja");

        for (Estudiante estudiante :equipo){

                System.out.println(estudiante.getCi());
                System.out.println("-------------------------------------------\n");

        }


    }

}
