package cl.awakelab.liquidaciones.services;
import cl.awakelab.liquidaciones.entity.Liquidacion;
import java.util.List;

public interface ILiquidacionService {
    List<Liquidacion> listarLiquidaciones();
    Liquidacion crearLiquidacion(Liquidacion liquidacion);
    Liquidacion buscarLiquidacionPorId(long idLiquidacion);
    Liquidacion actualizarLiquidacion(Liquidacion liquidacion, long idLiquidacion);
    public void eliminarLiquidacion(long idLiquidacion);
}
