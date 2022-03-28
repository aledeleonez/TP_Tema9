package vehiculos;

import java.time.LocalDate;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;

    public Vehiculo(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    


    

    
}
