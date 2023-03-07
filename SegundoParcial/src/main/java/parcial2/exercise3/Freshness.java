package parcial2.exercise3;

import java.util.List;

public class Freshness implements IStrategyAlgorithm {
    @Override
    public void algoritmo(List<Celular> equipo) {


        for (Celular celular :equipo){
            celular.setGama("Freshness");
            if (    celular.getPrecio()==1000 || celular.getPrecio()==1200 || celular.getPrecio()==3000 ||
                    celular.getModelo().toLowerCase().equals("S9") || celular.getModelo().toLowerCase().equals("S10") || celular.getModelo().toLowerCase().equals("S20")){
                System.out.println("\n Usando algoritmo Freshness");
                celular.print();
                System.out.println("-------------------------------------------\n");
            }else {
                celular.print();
            }
        }


    }

}
