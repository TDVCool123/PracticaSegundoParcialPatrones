package Ejercicios.exercise3;

public class Cliente {
    public static void main (String []args){

        PaginaWeb pagina = new PaginaWeb();
        pagina.setName("UPBNET");
        pagina.setDescription("this academy to share videos");

        Suscriptor pedro = new Suscriptor("Pedro");
        Suscriptor carla = new Suscriptor("Carla");
        Suscriptor roberto = new Suscriptor("Roberto");
        Suscriptor richard = new Suscriptor("Richard");
        Suscriptor Melina = new Suscriptor("Melina");

        pagina.subscription(pedro,true);
        pagina.subscription(carla,false);
        pagina.subscription(roberto,true);
        pagina.subscription(richard,false);
        pagina.subscription(Melina,true);

        // ****************** //

        pagina.uploadVideo(new Video("12345","Promocion"));
        pagina.uploadImage(new Image("12346","Caracas"));

    }
}
