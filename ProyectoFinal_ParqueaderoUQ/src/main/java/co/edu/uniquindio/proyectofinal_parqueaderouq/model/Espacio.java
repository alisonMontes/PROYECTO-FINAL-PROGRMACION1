package co.edu.uniquindio.proyectofinal_parqueaderouq.model;

public class Espacio{

    private String codigo;
    private TipoEspacio tipo;
    private EstadoEspacio estado;
    private Vehiculo vehiculoAsignado;


    public Espacio(String codigo, TipoEspacio tipo, EstadoEspacio estado, Vehiculo vehiculoAsignado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.estado = estado;
        this.vehiculoAsignado = vehiculoAsignado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoEspacio getTipo() {
        return tipo;
    }

    public void setTipo(TipoEspacio tipo) {
        this.tipo = tipo;
    }

    public EstadoEspacio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEspacio estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }
}
