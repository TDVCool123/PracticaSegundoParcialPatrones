package parcial2.exercise4;

public class Usuarios extends Persona{

    public Usuarios(ICanalComunication canalComunication) {
            super(canalComunication);
        }

        @Override
        public void send(String msg) {
            this.canalComunication.send(msg,this);
        }

        @Override
        public void received(String msg) {
            this.showInfo();
            System.out.println("INFO > received > "+msg+"\n");
        }

}
