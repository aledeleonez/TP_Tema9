package vehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Giroscopio extends Vehiculo{

    public double autonomia;
    public double alturaMin;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double autonomia, double alturaMin) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
        this.alturaMin = alturaMin;
    }

    @Override
    public String toString() {
        return String.format("- Giroscopio %s %s Fecha compra: %s %.2f km de autonomía \t %.2f €/hora", super.marca,super.modelo,fechaCompra.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")), autonomia, precio());
    }

    public double precio(){
        return 29.90;
    }

    

    
    
}
