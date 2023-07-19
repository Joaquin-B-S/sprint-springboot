package cl.awakelab.liquidaciones.services.serviceimpl;

import cl.awakelab.liquidaciones.entity.InstitucionPrevisional;
import cl.awakelab.liquidaciones.repository.IPrevisionRepo;
import cl.awakelab.liquidaciones.services.IPrevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("previsionImpl")
public class PrevisionImpl implements IPrevisionService {
    @Autowired
    IPrevisionRepo objPrevisionRepo;
    @Override
    public List<InstitucionPrevisional> listarPrevision() {
        return objPrevisionRepo.findAll();
    }

    @Override
    public InstitucionPrevisional buscarPrevisionPorId(int idInstPrevision) {
        return objPrevisionRepo.findById(idInstPrevision).orElseThrow(() -> new NoSuchElementException("Institución no encontrada"));
    }
}
