package traduccion;

import java.util.Scanner;

public class Frances implements Traduccion {

    Scanner teclado = new Scanner(System.in);

    @Override
    public double introducirDistancia() {
        System.out.println("Entrez la distance parcourue (km): ");
        double distancia = teclado.nextDouble();
        return distancia;
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Entrez le temps de trajet (min): ");
        double tiempo = teclado.nextDouble();
        return tiempo;
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("déplacé à une vitesse moyenne de ");
    }

    @Override
    public double finRespuesta() {
        return introducirDistancia()/introducirTiempo();
    }
    
}
