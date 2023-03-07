package parcial2.exercise2;

public class Teniente implements IHandler {
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
        if (ordenes.getTipo().equals("Disciplina")){

            System.out.println("Operacion: " + ordenes.getTipo() + " El teniente discilinara al nuevo ejercito pronto");
        } else {
            System.out.println("Operacion: " + ordenes.getTipo() +  " El coronel debe atender los bloqueos");
            next.orden(ordenes);
        }
    }
}
