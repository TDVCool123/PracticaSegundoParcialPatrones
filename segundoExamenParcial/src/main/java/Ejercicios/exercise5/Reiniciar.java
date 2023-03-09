package Ejercicios.exercise5;

public class Reiniciar implements IStateComputer {
    @Override
    public void computerBehavior(Computadora computadora) {


        System.out.println("Estado: Reiniciando");
        computadora.getMemoryRam().show();
        computadora.getCPU().show();

        System.out.println("Cerrando todos los programas");
    }
}
