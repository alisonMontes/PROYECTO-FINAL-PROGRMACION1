package co.edu.uniquindio.proyectofinal_parqueaderouq.model;

public interface IDescuento {

    double DESCUENTO_ESTUDIANTE = 0;
    double DECUENTO_DOCENTE = 0;
    double DESCUENTO_ADMINISTRATIVO = 0;

    double obtenerDescuento(String tipoUsuario);







}
