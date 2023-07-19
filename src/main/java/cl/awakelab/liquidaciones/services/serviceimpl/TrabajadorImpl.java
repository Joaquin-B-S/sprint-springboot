package cl.awakelab.liquidaciones.services.serviceimpl;

import cl.awakelab.liquidaciones.entity.Trabajador;
import cl.awakelab.liquidaciones.repository.ITrabajadorRepo;
import cl.awakelab.liquidaciones.services.ITrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("trabajadorImpl")
public class TrabajadorImpl implements ITrabajadorService {
    @Autowired
    ITrabajadorRepo objTrabajadorRepo;
    @Override
    public List<Trabajador> listarTrabajadores() {
        return objTrabajadorRepo.findAll();
    }

    @Override
    public Trabajador crearTrabajador(Trabajador trabajador) {
        return objTrabajadorRepo.save(trabajador);
    }

    @Override
    public Trabajador registrarTrabajador(Trabajador trabajador) {
        return objTrabajadorRepo.save(trabajador);
    }

    @Override
    public Trabajador buscarTrabajadorPorId(int idTrabajador) {
        return objTrabajadorRepo.findById(idTrabajador).orElseThrow(() -> new NoSuchElementException("Trabajador no encontrado"));
    }

    @Override
    public Trabajador actualizarTrabajador(Trabajador trabajadorActualizar, int idTrabajador) {
        Trabajador trabajador = objTrabajadorRepo.findById(idTrabajador).orElseThrow(()->new NoSuchElementException("Trabajador no encontrado"));
        trabajador.setRun(trabajadorActualizar.getRun());
        trabajador.setNombre(trabajadorActualizar.getNombre());
        trabajador.setApellido1(trabajadorActualizar.getApellido1());
        trabajador.setApellido2(trabajadorActualizar.getApellido2());
        trabajador.setEmail(trabajadorActualizar.getEmail());
        trabajador.setTelefono(trabajadorActualizar.getTelefono());
        trabajador.setInstSalud(trabajadorActualizar.getInstSalud());
        trabajador.setInstPrevision(trabajadorActualizar.getInstPrevision());
        return objTrabajadorRepo.save(trabajador);
    }

    @Override
    public Trabajador actualizarTrabajador2(Trabajador trabajadorActualizar) {
        Trabajador trabajador = objTrabajadorRepo.findById(trabajadorActualizar.getIdTrabajador()).orElseThrow(()->new NoSuchElementException("Trabajador no encontrado"));
        trabajador.setRun(trabajadorActualizar.getRun());
        trabajador.setNombre(trabajadorActualizar.getNombre());
        trabajador.setApellido1(trabajadorActualizar.getApellido1());
        trabajador.setApellido2(trabajadorActualizar.getApellido2());
        trabajador.setEmail(trabajadorActualizar.getEmail());
        trabajador.setTelefono(trabajadorActualizar.getTelefono());
        trabajador.setInstSalud(trabajadorActualizar.getInstSalud());
        trabajador.setInstPrevision(trabajadorActualizar.getInstPrevision());
        return objTrabajadorRepo.save(trabajador);
    }

    @Override
    public void eliminarTrabajador(Trabajador trabajador) {
        objTrabajadorRepo.delete(trabajador);
    }

    @Override
    public void eliminarTrabajador2(int idTrabajador) {
        objTrabajadorRepo.deleteById(idTrabajador);
    }
}
