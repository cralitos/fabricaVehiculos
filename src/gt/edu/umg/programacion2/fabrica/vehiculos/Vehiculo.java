package gt.edu.umg.programacion2.fabrica.vehiculos;

import gt.edu.umg.programacion2.fabrica.accesorios.Accesorio;

import java.util.List;

public abstract class Vehiculo {

    private List<Accesorio> accesorios;
    private String marca;
    private String modelo;

    public void agregarAccesorio(){
        System.out.println("agregan accesorio");
    }
}
