package traduccion;

import java.util.Scanner;

public class Español implements Traduccion {

    

    Scanner teclado = new Scanner(System.in);

    @Override
    public double introducirDistancia() {
        System.out.println("Introduzca la distancia recorrida (km): ");
        double distancia = teclado.nextDouble();
        return distancia;
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Introduzca el tiempo del recorrido (min): ");
        double tiempo = teclado.nextDouble();
        return tiempo;
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Se ha desplazado a una velocidad media de");
    }

    @Override
    public void finRespuesta(double distancia, double tiempo) {
        System.out.println(String.format("%.2f km/h", distancia/(tiempo/60)));
    }
    
}
