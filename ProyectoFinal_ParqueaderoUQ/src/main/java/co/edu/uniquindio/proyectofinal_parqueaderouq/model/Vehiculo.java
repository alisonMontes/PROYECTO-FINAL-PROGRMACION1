package co.edu.uniquindio.proyectofinal_parqueaderouq.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Vehiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String placa;
    private TipoVehiculo tipoVehiculo;
    private String nombreConductor;
    private String identificacionConductor;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida; // Nuevo campo
    private Espacio espacioAsignado;
    private EstadoVehiculo estado;
    private double valorPagado; // Nuevo campo

    public Vehiculo(String placa, TipoVehiculo tipoVehiculo, String nombreConductor, String identificacionConductor, LocalDateTime horaIngreso, Espacio espacioAsignado, EstadoVehiculo estado) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.nombreConductor = nombreConductor;
        this.identificacionConductor = identificacionConductor;
        this.horaIngreso = horaIngreso;
        this.espacioAsignado = espacioAsignado;
        this.estado = estado;
    }


    public String getPlaca()
    { return placa; }

    public void setPlaca(String placa)
    { this.placa = placa; }

    public TipoVehiculo getTipoVehiculo()
    { return tipoVehiculo; }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo)
    { this.tipoVehiculo = tipoVehiculo; }


    public String getNombreConductor()
    { return nombreConductor; }

    public void setNombreConductor(String nombreConductor)
    { this.nombreConductor = nombreConductor; }

    public String getIdentificacionConductor()
    { return identificacionConductor; }

    public void setIdentificacionConductor(String identificacionConductor)
    { this.identificacionConductor = identificacionConductor; }


    public LocalDateTime getHoraIngreso()
    { return horaIngreso; }

    public void setHoraIngreso(LocalDateTime horaIngreso)
    { this.horaIngreso = horaIngreso; }


    public LocalDateTime getHoraSalida()
    { return horaSalida; }

    public void setHoraSalida(LocalDateTime horaSalida)
    { this.horaSalida = horaSalida; }

    public Espacio getEspacioAsignado()
    { return espacioAsignado; }

    public void setEspacioAsignado(Espacio espacioAsignado)
    { this.espacioAsignado = espacioAsignado; }


    public EstadoVehiculo getEstado()
    { return estado; }

    public void setEstado(EstadoVehiculo estado)
    { this.estado = estado; }

    public double getValorPagado() {
        return valorPagado; }

    public void setValorPagado(double valorPagado)
    { this.valorPagado = valorPagado; }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa='" + placa + '\'' + ", estado=" + estado + '}';
    }
}
