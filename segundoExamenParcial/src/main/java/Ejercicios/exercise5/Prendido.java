package Ejercicios.exercise5;

public class Prendido implements IStateComputer {
        @Override
        public void computerBehavior(Computadora computadora) throws InterruptedException {

            System.out.println("Estado: Prendido");
            int actualUseCPU = computadora.getCPU().getPercentageUse();
            int actualUseRam = computadora.getMemoryRam().getPercentageUse();
            int randomUse=(int) ((Math.random() * (100 - 1)) + 1);
            computadora.getMemoryRam().show();
            computadora.getCPU().show();

            int i;
            for (i=0; i < randomUse; i++ ){
                Thread.sleep(5000);
                actualUseCPU =+ 5;
                actualUseRam =+ 5;
                computadora.getCPU().setPercentageUse(actualUseCPU);
                computadora.getCPU().show();

                computadora.getMemoryRam().setPercentageUse(actualUseRam);
                computadora.getMemoryRam().show();
                System.out.println("Esta incrementando el consumo de recursos");
                System.out.println("-------------------------------------------------");
            }




        }

}
