package co.edu.uniquindio.proyectofinal_parqueaderouq.model;

import java.util.List;

public class Parqueadero {

    private String nombre;
    private String Direccion;


    private List<Vehiculo> listVehiculos;
    private List<Usuario> listUsuarios;
    private List <Espacio> listEspacios;
    private List <Empleado> listEmpleados;


    public Parqueadero(String nombre, String direccion, List<Vehiculo> listVehiculo, List<Usuario> listUsuario, List<Espacio> listEspacio) {
        this.nombre = nombre;
        this.Direccion = direccion;
        this.listEspacios = listEspacio;
        this.listUsuarios = listUsuario;
        this.listVehiculos= listVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Parqueadero{" +
                "nombre='" + nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }
}
