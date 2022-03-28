package vehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Segway extends Vehiculo{

    public double autonomia;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return String.format("- Segway %s %s Fecha compra: %s %.2f km de autonomía \t %.2f €/hora", super.marca,super.modelo,fechaCompra.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")), autonomia, precio());
    }

    public double precio(){
        return 18.90;
    }

    
    
}
