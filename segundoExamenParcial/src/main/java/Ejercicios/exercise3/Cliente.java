package Ejercicios.exercise3;

public class Cliente {
    public static void main (String []args){

        PaginaWeb pagina = new PaginaWeb();
        pagina.setName("UPBNET");
        pagina.setDescription("this academy to share videos");

        Suscriptor jose = new Suscriptor("Pedro");
        Suscriptor ambar = new Suscriptor("Carla");
        Suscriptor dylan = new Suscriptor("Roberto");
        Suscriptor emanuel = new Suscriptor("Richard");

        pagina.subscription(jose,true);
        pagina.subscription(ambar,false);
        pagina.subscription(dylan,true);
        pagina.subscription(emanuel,true);

        // ****************** //

        pagina.uploadVideo(new Video("12345","Promocion"));
        pagina.uploadImage(new Image("12346","Caracas"));

    }
}
