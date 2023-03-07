package parcial2.exercise2;

public class Coronel implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void orden(Ordenes ordenes) {
        // cadena
        System.out.println("--------------------------------------------------------");
        ordenes.showInfo();
        if (ordenes.getTipo().equals("Bloqueos")){

            System.out.println("Operacion: " + ordenes.getTipo() + " El coronel se encargara de los bloqueos enseguida");
        } else {
            System.out.println("Operacion:" + ordenes.getTipo() +  " La limpieza la realizan los cabos ");
            next.orden(ordenes);
        }
    }
}
