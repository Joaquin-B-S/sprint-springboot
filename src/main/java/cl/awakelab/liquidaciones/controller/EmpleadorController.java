package cl.awakelab.liquidaciones.controller;

import cl.awakelab.liquidaciones.entity.Empleador;
import cl.awakelab.liquidaciones.entity.Usuario;
import cl.awakelab.liquidaciones.services.IEmpleadorService;
import cl.awakelab.liquidaciones.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/empleador")
public class EmpleadorController {
    @Autowired
    IEmpleadorService objEmpleadorService;

    @Autowired
    IUsuarioService objUsuarioService;

    @GetMapping
    public String listarEmpleador(Model model){
        List<Empleador> listaEmpleadores = objEmpleadorService.listarEmpleadores();
        model.addAttribute("empleadores", listaEmpleadores);
        return "listarEmpleadores";
    }

    @GetMapping("/crearEmpleador")
    public String mostrarFormularioCrearEmpleador(Model model){
        List<Usuario> listaUsuarios = objUsuarioService.listarUsuarios();
        model.addAttribute("usuarios", listaUsuarios);
        return "formEmpleador";
    }

    @PostMapping("/crearEmpleador")
    public String crearEmpleador(@ModelAttribute Empleador empleador){
        objEmpleadorService.crearEmpleador(empleador);
        return "redirect:/empleador";
    }

//    @GetMapping("/registrar")
//    public String mostrarFormularioRegistro(Model model){
//        return "registro";
//    }
//
//    @PostMapping("/registrar")
//    public String registrarEmpleador(@ModelAttribute Empleador empleador){
//        objEmpleadorService.registrarEmpleador(empleador);
//        return "redirect:/login";
//    }

    @GetMapping("/{idEmpleador}")
    public String buscarEmpleadorPorId(@PathVariable int idEmpleador, Model model) {
        Empleador empleador = objEmpleadorService.buscarEmpleadorPorId(idEmpleador);
        model.addAttribute("empleador", empleador);
        return "redirect:/empleador";
    }
    @PostMapping("/editar/{idEmpleador}")
    public String mostrarFormularioEditarEmpleador(@PathVariable int idEmpleador, Model model) {
        model.addAttribute("empleador", objEmpleadorService.buscarEmpleadorPorId(idEmpleador));
        List<Usuario> listaUsuarios = objUsuarioService.listarUsuarios();
        model.addAttribute("usuarios", listaUsuarios);
        return "editarEmpleador";
    }

    @PostMapping("/actualizar/{idEmpleador}")
    public String actualizarUsuario(@ModelAttribute Empleador empleador, @PathVariable int idEmpleador) {
        objEmpleadorService.actualizarEmpleador(empleador, idEmpleador);
        return "redirect:/empleador";
    }

    @GetMapping("/{idEmpleador}/eliminar")
    public String mostrarEliminarEmpleador(@PathVariable int idEmpleador, Model model){
        Empleador empleadorEliminar = objEmpleadorService.buscarEmpleadorPorId(idEmpleador);
        model.addAttribute("empleador", empleadorEliminar);
        return "eliminarEmpleador";
    }

    @PostMapping("/eliminar/{idEmpleador}")
    public String eliminarEmpleadorPorId(@PathVariable int idEmpleador) {
        objEmpleadorService.eliminarEmpleador2(idEmpleador);
        return "redirect:/empleador";
    }
}
