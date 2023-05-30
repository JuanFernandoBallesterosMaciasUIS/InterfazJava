package modelo;

public class Bicicleta implements Rueda, Silla{


    public void avanzar() {
        System.out.println("La bicicleta avanza");
    }


    public void detenerse() {
        System.out.println("La bicicleta se detiene");
    }


    public void sentarse() {
        System.out.println("La persona se sienta en la bicicleta");
    }

    public void levantarse() {
        System.out.println("La persona se levanta de la bicicleta");
    }
}
