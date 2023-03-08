package Ejercicios.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ChatJuegos implements ICanalComunication {

    private List<Jugadores> jugadoresChat = new ArrayList<>();

    public ChatJuegos addProfesionalToTheChat(Jugadores jugadores) {
        jugadoresChat.add(jugadores);
        return this;
    }

    @Override
    public void send(String message, Jugador jugador) {
        for (Jugadores jugadores : jugadoresChat) {
            if (!jugador.getAlias().equals(jugadores.getAlias())) {
                if (jugador.getEquipo().equals("Alfa") && jugadores.getEquipo().equals("Alfa")) {
                    jugadores.received(message);
                } else if (jugador.getEquipo().equals("Gamma") && jugadores.getEquipo().equals("Gamma")) {
                    jugadores.received(message);
                } else if (jugador.getName().equals("Rene")) {
                    jugadores.received(message);
                }
            }
        }
    }
}
