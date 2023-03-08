package templates.strategy;

public class Client {
    public static void main (String []args){
        MemoryRam ram = new MemoryRam(0,"16G","DDR4");
        CPU CPU = new CPU(0,"32G","MSI");
        Computadora pc = new Computadora(ram, CPU);

        pc.setStateComputer(new Apagado());
        pc.useComputer();

        pc.setStateComputer(new Reiniciar());
        pc.useComputer();

        pc.setStateComputer(new Apagado());
        pc.useComputer();
    }

}
