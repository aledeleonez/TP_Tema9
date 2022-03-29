package traduccion;

import java.util.Scanner;

public class Ingles implements Traduccion {

    Scanner teclado = new Scanner(System.in);

    @Override
    public double introducirDistancia() {
        System.out.println("Enter the distance traveled: (km): ");
        double distancia = teclado.nextDouble();
        return distancia;
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Enter the travel time: (min): ");
        double tiempo = teclado.nextDouble();
        return tiempo;
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("It has moved at an average speed of");
    }

    @Override
    public void finRespuesta(double distancia, double tiempo) {
        System.out.println(String.format("%.2f km/h", distancia/(tiempo/60)));
    }
    
}
