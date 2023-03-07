package parcial2.exercise2;

public class General implements IHandler {
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
            if (ordenes.getTipo().equals("Entrevista")){

                System.out.println("Operacion: " + ordenes.getTipo() + " El coronel atendera la entrevista pronto");
            } else {
                System.out.println("Operacion:" + ordenes.getTipo() +  " El teniente debe atender la disciplina");
                next.orden(ordenes);
            }
        }
}
