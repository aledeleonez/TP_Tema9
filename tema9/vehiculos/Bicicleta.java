package vehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bicicleta extends Vehiculo {
    
    public int velocidades;


    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int velocidades) {
        super(marca, modelo, fechaCompra);
        this.velocidades = velocidades;
    }

    @Override
    public String toString() {
        return String.format("- Bicicleta %s %s Fecha compra: %s %d velocidades \t %.2f €/hora", super.marca,super.modelo, fechaCompra.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")), velocidades, precio());
    }

    public double precio(){
        return 4.90;
    }

    
}
