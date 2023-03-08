package Ejercicios.exercise2;

public class Jugadores extends Jugador {

    public Jugadores(ICanalComunication canalComunication) {
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
