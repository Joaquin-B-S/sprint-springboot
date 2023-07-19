package cl.awakelab.liquidaciones.services;

import cl.awakelab.liquidaciones.entity.Trabajador;

import java.util.List;

public interface ITrabajadorService {
    List<Trabajador> listarTrabajadores ();
    Trabajador crearTrabajador(Trabajador trabajador);
    Trabajador registrarTrabajador(Trabajador trabajador);
    Trabajador buscarTrabajadorPorId(int idTrabajador);
    Trabajador actualizarTrabajador(Trabajador trabajador, int idTrabajador);
    Trabajador actualizarTrabajador2(Trabajador trabajador);
    public void eliminarTrabajador(Trabajador trabajador);
    public void eliminarTrabajador2(int idTrabajador);
}
