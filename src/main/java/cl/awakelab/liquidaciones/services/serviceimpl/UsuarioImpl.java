package cl.awakelab.liquidaciones.services.serviceimpl;
import cl.awakelab.liquidaciones.entity.Usuario;
import cl.awakelab.liquidaciones.repository.IUsuarioRepository;
import cl.awakelab.liquidaciones.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("usuarioImpl")
public class UsuarioImpl implements IUsuarioService {
    @Autowired //inyeccion de repositorio
    IUsuarioRepository objUsuarioRepo;
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return objUsuarioRepo.save(usuario);
    }
    @Override
    public List<Usuario> listarUsuarios() {
        return objUsuarioRepo.findAll();
    }
    @Override
    public Usuario buscarUsuarioPorId(int idUsuario) {
        return objUsuarioRepo.findById(idUsuario).orElseThrow(() -> new NoSuchElementException("Usuario no encontrado"));
    }
    @Override
    public Usuario actualizarUsuario(Usuario usuarioActualizar, int idUsuario) {
        Usuario usuario = objUsuarioRepo.findById(idUsuario).orElseThrow(()->new NoSuchElementException("Usuario no encontrado"));
        usuario.setRun(usuarioActualizar.getRun());
        usuario.setNombre(usuarioActualizar.getNombre());
        usuario.setApellido_1(usuarioActualizar.getApellido_1());
        usuario.setApellido_2(usuarioActualizar.getApellido_2());
        usuario.setEmail(usuarioActualizar.getEmail());
        usuario.setFecha_creacion(usuarioActualizar.getFecha_creacion());
        usuario.setTelefono(usuarioActualizar.getTelefono());
        usuario.setClave(usuarioActualizar.getClave());

        return objUsuarioRepo.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario2(Usuario usuarioActualizar) {
        Usuario usuario = objUsuarioRepo.findById(usuarioActualizar.getId_usuario()).orElseThrow(()->new NoSuchElementException("Usuario no encontrado"));
        usuario.setRun(usuarioActualizar.getRun());
        usuario.setNombre(usuarioActualizar.getNombre());
        usuario.setApellido_1(usuarioActualizar.getApellido_1());
        usuario.setApellido_2(usuarioActualizar.getApellido_2());
        usuario.setEmail(usuarioActualizar.getEmail());
        usuario.setFecha_creacion(usuarioActualizar.getFecha_creacion());
        usuario.setTelefono(usuarioActualizar.getTelefono());
        usuario.setClave(usuarioActualizar.getClave());

        return objUsuarioRepo.save(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        objUsuarioRepo.delete(usuario);
    }

    @Override
    public void eliminarUsuario2(int idUsuario) {
        objUsuarioRepo.deleteById(idUsuario);
    }
}
