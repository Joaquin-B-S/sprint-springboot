package cl.awakelab.liquidaciones.controller;

import cl.awakelab.liquidaciones.entity.Usuario;
import cl.awakelab.liquidaciones.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    IUsuarioService objUsuarioService;

    @GetMapping
    public String listarUsuarios(Model model){
        List<Usuario> listaUsuarios = objUsuarioService.listarUsuarios();
        model.addAttribute("usuarios", listaUsuarios);
        return "listarUsuarios";
    }

    @GetMapping("/crearUsuario")
    public String mostrarFormularioCrearUsuario(Model model){
        return "formUsuario";
    }

    @PostMapping("/crearUsuario")
    public String crearUsuario(@ModelAttribute Usuario usuario){
        usuario.setFechaCreacion(LocalDateTime.now());
        objUsuarioService.crearUsuario(usuario);
        return "redirect:/usuario";
    }

    @GetMapping("/registrar")
    public String mostrarFormularioRegistro(Model model){
        return "registro";
    }

    @PostMapping("/registrar")
    public String registrarUsuario(@ModelAttribute Usuario usuario){
        usuario.setFechaCreacion(LocalDateTime.now());
        objUsuarioService.registrarUsuario(usuario);
        return "redirect:/login";
    }

    @GetMapping("/{idUsuario}")
    public String buscarUsuarioPorId(@PathVariable int idUsuario, Model model) {
        Usuario usuario = objUsuarioService.buscarUsuarioPorId(idUsuario);
        model.addAttribute("usuario", usuario);
        return "redirect:/usuario";
    }
    @PostMapping("/editar/{idUsuario}")
    public String mostrarFormularioEditarUsuario(@PathVariable int idUsuario, Model model) {
        model.addAttribute("usuario", objUsuarioService.buscarUsuarioPorId(idUsuario));
        return "editarUsuario";
    }

    @PostMapping("/actualizar/{idUsuario}")
    public String actualizarUsuario(@ModelAttribute Usuario usuario, @PathVariable int idUsuario) {
        usuario.setFechaCreacion(LocalDateTime.now());
        objUsuarioService.actualizarUsuario(usuario, idUsuario);
        return "redirect:/usuario";
    }

    @GetMapping("/{idUsuario}/eliminar")
    public String mostrarEliminarUsuario(@PathVariable int idUsuario, Model model){
        Usuario usuarioEliminar = objUsuarioService.buscarUsuarioPorId(idUsuario);
        model.addAttribute("usuario", usuarioEliminar);
        return "eliminarUsuario";
    }

    @PostMapping("/eliminar/{idUsuario}")
    public String eliminarUsuarioPorId(@PathVariable int idUsuario) {
        objUsuarioService.eliminarUsuario2(idUsuario);
        return "redirect:/usuario";
    }
}