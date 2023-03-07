package parcial2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements ICanalComunication {

    private List<Usuarios> usuariosChat = new ArrayList<>();

    public Whatsapp addUsersToTheChat(Usuarios usuarios) {
        usuariosChat.add(usuarios);
        return this;
    }

    @Override
    public void send(String message, Persona persona) {
        for (Usuarios users : usuariosChat) {
            if (!persona.getNum().equals(users.getNum())) {
                if (users.getGrupo().equals("Patrones1")) {
                    users.received(message);
                } else if (users.getNum().equals("222") ) {
                    users.received(message);
                }
            }
        }
    }
}
