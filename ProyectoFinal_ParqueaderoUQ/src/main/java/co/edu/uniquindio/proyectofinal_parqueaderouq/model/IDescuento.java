package co.edu.uniquindio.proyectofinal_parqueaderouq.model;

public interface IDescuento {

    double DESCUENTO_ESTUDIANTE = 0.15;
    double DECUENTO_DOCENTE = 0.25;
    double DESCUENTO_ADMINISTRATIVO = 0.20;

    double obtenerDescuento(TipoUsuario tipoUsuario);
    double aplicarDescuente (double valorTotal,TipoUsuario tipoUsuario);







}
