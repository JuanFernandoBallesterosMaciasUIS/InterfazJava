package modelo;

public class Carro implements Rueda, Silla {
    
        public void avanzar() {
            System.out.println("El carro avanza");
        }
    
        public void detenerse() {
            System.out.println("El carro se detiene");
        }
    
        public void sentarse() {
            System.out.println("La persona se sienta en el carro");
        }
    
        public void levantarse() {
            System.out.println("La persona se levanta del carro");
        }
    
}
