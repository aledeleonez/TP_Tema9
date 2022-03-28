import java.time.LocalDate;

import vehiculos.Bicicleta;
import vehiculos.Garaje;
import vehiculos.Giroscopio;
import vehiculos.Segway;

public class Main {
    public static void main(String[] args) throws Exception {
        
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
        
        

    }
}
