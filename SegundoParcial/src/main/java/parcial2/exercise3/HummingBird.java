package parcial2.exercise3;

import java.util.List;

public class HummingBird implements IStrategyAlgorithm {
    @Override
    public void algoritmo(List<Celular> equipo) {


        for (Celular celular :equipo){
            celular.setGama("HummingBird");
            if (celular.getPrecio()==1100 || celular.getPrecio()==900 ||
                    celular.getModelo().toLowerCase().equals("P20") || celular.getModelo().toLowerCase().equals("P18")){
                System.out.println("\n Usando algoritmo HummingBird");
                celular.print();
                System.out.println("-------------------------------------------\n");
            }else {
                celular.print();
            }
        }


    }
}
