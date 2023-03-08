package templates.strategy;

public class Apagado implements  IStateComputer{
    @Override
    public void computerBehavior(Computadora computadora) {
        computadora.getMemoryRam().setPercentageUse(0);
        computadora.getCPU().setPercentageUse(0);
        System.out.println("Estado: Apagado");
        computadora.getMemoryRam().show();
        computadora.getCPU().show();
    }
}
