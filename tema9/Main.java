import java.time.LocalDate;
import java.util.Scanner;

import traduccion.Aleman;
import traduccion.Español;
import traduccion.Frances;
import traduccion.Ingles;
import vehiculos.Bicicleta;
import vehiculos.Garaje;
import vehiculos.Giroscopio;
import vehiculos.Segway;

public class Main {
    public static void main(String[] args) throws Exception {

        try (Scanner teclado = new Scanner(System.in)) {
            menu();
            int opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    Garaje garaje = new Garaje();

                    Bicicleta bici1 = new Bicicleta("Lapierre", "Speed 400", LocalDate.of(2021, 4, 15), 27);
                    garaje.miGaraje.add(bici1);
                    Bicicleta bici2 = new Bicicleta("Btwin", "Riverside 900", LocalDate.of(2022, 1, 4), 10);
                    garaje.miGaraje.add(bici2);
                    Giroscopio giro1 = new Giroscopio("Segway", "Nine", LocalDate.of(2018, 5, 17), 40, 165);
                    garaje.miGaraje.add(giro1);
                    Giroscopio giro2 = new Giroscopio("Weebot", "Echo", LocalDate.of(2020, 7, 14), 35, 170);
                    garaje.miGaraje.add(giro2);
                    Segway seg1 = new Segway("Immotion", "v8", LocalDate.of(2021, 5, 29), 40);
                    garaje.miGaraje.add(seg1);
                    Segway seg2 = new Segway("Segway", "Ninebot One E+", LocalDate.of(2018, 12, 6), 30);
                    garaje.miGaraje.add(seg2);
            
                    garaje.mostrarVehiculos();
                break;
                case 2:
                    idiomas();
                    int opcion2 = teclado.nextInt();
                    switch(opcion2){
                        case 1:
                            Español español = new Español();
                            double d = español.introducirDistancia();
                            double t = español.introducirTiempo();
                            español.inicioRespuesta();
                            español.finRespuesta(d,t);
                        break;
                        case 2:
                            Ingles ingles = new Ingles();
                            d = ingles.introducirDistancia();
                            t = ingles.introducirTiempo();
                            ingles.inicioRespuesta();
                            ingles.finRespuesta(d,t);
                        break;
                        case 3:
                            Aleman aleman = new Aleman();
                            d = aleman.introducirDistancia();
                            t = aleman.introducirTiempo();
                            aleman.inicioRespuesta();
                            aleman.finRespuesta(d,t);
                        break;
                        case 4:
                            Frances frances = new Frances();
                            d = frances.introducirDistancia();
                            t = frances.introducirTiempo();
                            frances.inicioRespuesta();
                            frances.finRespuesta(d,t);
                        break;
                    }
                break;
            }
        }

        
    }

    private static void menu(){
        System.out.println("Selecciona que ejercicio quieres ejecutar: ");
        System.out.println("Ejercicio 1: El alquiler de bicis ");
        System.out.println("Ejercicio 2: Velocidad media version bilingüe ");
    }

    private static void idiomas(){
        System.out.println("Elije con un numero un idioma de ejecución: ");
        System.out.println("1.- Español");
        System.out.println("2.- English");
        System.out.println("3.- Deutsch");
        System.out.println("4.- Français");
    }
    
}
