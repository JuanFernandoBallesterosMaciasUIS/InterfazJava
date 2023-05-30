package ejecutable;
import modelo.Bicicleta;
import modelo.Carro;
public class Test {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.avanzar();
        bici.sentarse();
        bici.levantarse();
        bici.detenerse();
        System.out.println("\n");

        Carro carro = new Carro();
        carro.avanzar();
        carro.sentarse();
        carro.levantarse();
        carro.detenerse();



    }

    
}
