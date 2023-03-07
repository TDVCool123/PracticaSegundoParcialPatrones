package parcial2.exercise2;

public class Cabo implements IHandler {
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
        if (ordenes.getTipo().equals("Limpieza")){

            System.out.println("Operacion: " + ordenes.getTipo() + " Los cabos limpiaran el desastre");
        }
    }
}
