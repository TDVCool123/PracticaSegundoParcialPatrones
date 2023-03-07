package parcial2.exercise3;

public class Client {
    public static void main(String []args){

        Tienda tienda = new Tienda("TecnoSell");
        tienda.addCelular(new Celular("S9","Samsumg","Alta",1000))
                .addCelular(new Celular("S10","Samsumg","Alta",1200))
                .addCelular(new Celular("S21","Samsumg","Alta",3000))
                .addCelular(new Celular("P20","Huawei","Media",1100))
                .addCelular(new Celular("P18","Huawei","Media",900));

        String gama="Alta";

        // condicion para saber cual es la mejor estrategia a usar

        if (gama.equals("Alta")){
            tienda.setStrategyAlgorithm(new Freshness());
        }else{
            tienda.setStrategyAlgorithm(new HummingBird());
        }

        tienda.vender();
    }
}
