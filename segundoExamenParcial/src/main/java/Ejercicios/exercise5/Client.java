package Ejercicios.exercise5;

public class Client {
    public static void main (String []args) throws InterruptedException {
        MemoryRam ram = new MemoryRam(0,"16G","DDR4");
        CPU CPU = new CPU(0,"32G","MSI");
        Computadora pc = new Computadora(ram, CPU);

        pc.setStateComputer(new Apagado());
        pc.useComputer();
        System.out.println("-------------------------------------------------");


        pc.setStateComputer(new Reiniciar());
        pc.useComputer();
        System.out.println("-------------------------------------------------");


        pc.setStateComputer(new Prendido());
        pc.useComputer();


    }

}
