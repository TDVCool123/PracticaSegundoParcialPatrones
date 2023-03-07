package parcial2.exercise6;

public class Client {
    public static void main(String[] args) {
        ChatRoom chat = new ChatRoom();

        Desarrollador d1 = new Desarrollador(chat, "Alan");
        Desarrollador d3 = new Desarrollador(chat, "Kathy");
        Desarrollador d4 = new Desarrollador(chat, "Patricio");
        Desarrollador d2 = new Desarrollador(chat, "Bob");
        Desarrollador d5 = new Desarrollador(chat, "Carla");

        d1.setGroupMode(true);
        d2.setGroupMode(true);
        d3.setGroupMode(false);
        d4.setGroupMode(false);
        d5.setGroupMode(true);

        chat.addToChat(d1).addToChat(d2).addToChat(d3).addToChat(d4).addToChat(d5);

        d3.send("Subiendo codigo terminado");
        d1.send("Falta de metodos en la clase comunicacion");


    }

}
