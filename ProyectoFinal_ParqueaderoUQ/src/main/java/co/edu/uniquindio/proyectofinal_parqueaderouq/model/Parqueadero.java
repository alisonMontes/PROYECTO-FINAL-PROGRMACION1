package co.edu.uniquindio.proyectofinal_parqueaderouq.model;

public class Parqueadero {

    private String nombre;
    private String Direccion;
    private String nivel;


    public Parqueadero(String nombre, String direccion) {
        this.nombre = nombre;
        this.Direccion = direccion;

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
