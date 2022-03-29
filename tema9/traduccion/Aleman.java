package traduccion;

import java.util.Scanner;

public class Aleman implements Traduccion {

    Scanner teclado = new Scanner(System.in);

    @Override
    public double introducirDistancia() {
        System.out.println("Geben Sie die zurückgelegte Strecke ein (km): ");
        double distancia = teclado.nextDouble();
        return distancia;
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Geben Sie die Reisezeit ein (min): ");
        double tiempo = teclado.nextDouble();
        return tiempo;
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Es hat sich mit einer Durchschnittsgeschwindigkeit von bewegt ");
    }

    @Override
    public void finRespuesta(double distancia, double tiempo) {
        System.out.println(String.format("%.2f km/h", distancia/(tiempo/60)));
    }
    
}
