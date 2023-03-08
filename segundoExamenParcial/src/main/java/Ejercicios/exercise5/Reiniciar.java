package Ejercicios.exercise5;

public class Reiniciar implements IStateComputer {
    @Override
    public void computerBehavior(Computadora computadora) {
//        int randomUse=(int) ((Math.random() * (100 - 1)) + 1);
//        computadora.getMemoryRam().setPercentageUse(randomUse);
        System.out.println("Cerrando todos los programas");
        System.out.println("Estado: Reiniciando");
        computadora.getMemoryRam().show();
        computadora.getCPU().show();
    }
}
