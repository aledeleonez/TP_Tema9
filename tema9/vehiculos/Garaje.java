package vehiculos;
import java.util.ArrayList;
import java.util.List;


public class Garaje {
    
    public List<Vehiculo> miGaraje;

    public Garaje() {
        this.miGaraje = new ArrayList<>();
    }

    public void mostrarVehiculos(){
        System.out.println("Estos son los ciclos que ofrecemos en alquiler: ");
        for (Vehiculo vehiculo : miGaraje) {
            System.out.println(vehiculo);
        }
    }

   

    
    
    

    

    
}
