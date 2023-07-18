package cl.awakelab.liquidaciones.services.serviceimpl;

import cl.awakelab.liquidaciones.entity.Empleador;
import cl.awakelab.liquidaciones.entity.Usuario;
import cl.awakelab.liquidaciones.repository.IEmpladorRepo;
import cl.awakelab.liquidaciones.services.IEmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("empleadorImpl")
public class EmpleadorImpl implements IEmpleadorService {

    @Autowired
    IEmpladorRepo objEmpleadorRepo;

    @Override
    public List<Empleador> listarEmpleadores() {
        return objEmpleadorRepo.findAll();
    }

    @Override
    public Empleador crearEmpleador(Empleador empleador) {
        return objEmpleadorRepo.save(empleador);
    }

    @Override
    public Empleador registrarEmpleador(Empleador empleador) {
        return objEmpleadorRepo.save(empleador);
    }

    @Override
    public Empleador buscarEmpleadorPorId(int idEmpleador) {
        return objEmpleadorRepo.findById(idEmpleador).orElseThrow(() -> new NoSuchElementException("Empleador no encontrado"));
    }

    @Override
    public Empleador actualizarEmpleador(Empleador empleadorActualizar, int idEmpleador) {
        Empleador empleador = objEmpleadorRepo.findById(idEmpleador).orElseThrow(()->new NoSuchElementException("Empleador no encontrado"));
        empleador.setRun(empleadorActualizar.getRun());
        empleador.setNombre(empleadorActualizar.getNombre());
        empleador.setApellido1(empleadorActualizar.getApellido1());
        empleador.setApellido2(empleadorActualizar.getApellido2());
        empleador.setDireccion(empleadorActualizar.getDireccion());
        empleador.setEmail(empleadorActualizar.getEmail());
        empleador.setTelefono(empleadorActualizar.getTelefono());
        return objEmpleadorRepo.save(empleador);
    }

    @Override
    public Empleador actualizarEmpleador2(Empleador empleadorActualizar) {
        Empleador empleador = objEmpleadorRepo.findById(empleadorActualizar.getIdEmpleador()).orElseThrow(()->new NoSuchElementException("Empleador no encontrado"));
        empleador.setRun(empleadorActualizar.getRun());
        empleador.setNombre(empleadorActualizar.getNombre());
        empleador.setApellido1(empleadorActualizar.getApellido1());
        empleador.setApellido2(empleadorActualizar.getApellido2());
        empleador.setDireccion(empleadorActualizar.getDireccion());
        empleador.setEmail(empleadorActualizar.getEmail());
        empleador.setTelefono(empleadorActualizar.getTelefono());
        return objEmpleadorRepo.save(empleador);
    }

    @Override
    public void eliminarEmpleador(Empleador empleador) {
        objEmpleadorRepo.delete(empleador);
    }

    @Override
    public void eliminarEmpleador2(int idEmpleador) {
        objEmpleadorRepo.deleteById(idEmpleador);
    }
}
