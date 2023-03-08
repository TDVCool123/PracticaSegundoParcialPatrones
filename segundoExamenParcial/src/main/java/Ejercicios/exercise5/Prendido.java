package Ejercicios.exercise5;

public class Prendido implements IStateComputer {
        @Override
        public void computerBehavior(Computadora computadora) {

            int actualUse = computadora.getCPU().getPercentageUse();

            while (computadora.getCPU().getPercentageUse() <= 100){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(">>> incrementando cada 5 segundo .... <<<");
                actualUse = actualUse + 5;
                computadora.getCPU().setPercentageUse(actualUse);
                computadora.getCPU().show();
                if (actualUse > 100){
                    computadora.getCPU().setPercentageUse(100);
                }
            }

            System.out.println(">>> estamos al 100%  <<<");
            computadora.getCPU().show();
        }

}
