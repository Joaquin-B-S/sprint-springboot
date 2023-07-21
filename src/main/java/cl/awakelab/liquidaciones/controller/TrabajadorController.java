package cl.awakelab.liquidaciones.controller;

import cl.awakelab.liquidaciones.entity.Empleador;
import cl.awakelab.liquidaciones.entity.InstitucionPrevisional;
import cl.awakelab.liquidaciones.entity.InstitucionSalud;
import cl.awakelab.liquidaciones.entity.Trabajador;
import cl.awakelab.liquidaciones.services.IEmpleadorService;
import cl.awakelab.liquidaciones.services.IPrevisionService;
import cl.awakelab.liquidaciones.services.ISaludService;
import cl.awakelab.liquidaciones.services.ITrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/trabajador")
public class TrabajadorController {
    @Autowired
    ITrabajadorService objTrabajadorService;
    @Autowired
    IEmpleadorService objEmpleadorService;
    @Autowired
    IPrevisionService objPrevisionService;
    @Autowired
    ISaludService objSaludService;
    @GetMapping
    public String listarTrabajadores(Model model){
        List<Trabajador> listaTrabajadores = objTrabajadorService.listarTrabajadores();
        model.addAttribute("trabajadores", listaTrabajadores);
        return "listarTrabajadores";
    }

    @GetMapping("/crearTrabajador")
    public String mostrarFormularioCrearTrabajador(Model model){
        List<InstitucionPrevisional> prevision = objPrevisionService.listarPrevision();
        List<Empleador> empleador = objEmpleadorService.listarEmpleadores();
        List<InstitucionSalud> salud = objSaludService.listarSalud();
        model.addAttribute("prevision", prevision);
        model.addAttribute("empleador", empleador);
        model.addAttribute("salud", salud);
        return "formTrabajador";
    }

    @PostMapping("/crearTrabajador")
    public String crearTrabajador(@ModelAttribute Trabajador trabajador, @RequestParam("empleadorId") int empleadorId, @RequestParam("previsionId") int previsionId,
    @RequestParam("saludId") int saludId){
        Empleador empleador = objEmpleadorService.buscarEmpleadorPorId(empleadorId);
        InstitucionPrevisional prevision = objPrevisionService.buscarPrevisionPorId(previsionId);
        InstitucionSalud salud = objSaludService.buscarSaludPorId(saludId);
        trabajador.setInstPrevision(prevision);
        trabajador.setInstSalud(salud);
        List<Empleador> listaEmpleadores = new ArrayList<>();
        listaEmpleadores.add(empleador);
        trabajador.setListaEmpleadores(listaEmpleadores);
        objTrabajadorService.crearTrabajador(trabajador);
        return "redirect:/trabajador";
    }

    @GetMapping("/{idTrabajador}")
    public String buscarTrabajadorPorId(@PathVariable int idTrabajador, Model model) {
        Trabajador trabajador = objTrabajadorService.buscarTrabajadorPorId(idTrabajador);
        model.addAttribute("trabajador", trabajador);
        return "redirect:/trabajador";
    }
    @PostMapping("/editar/{idTrabajador}")
    public String mostrarFormularioEditarTrabajador(@PathVariable int idTrabajador, Model model) {
        model.addAttribute("trabajador", objTrabajadorService.buscarTrabajadorPorId(idTrabajador));
        List<InstitucionPrevisional> prevision = objPrevisionService.listarPrevision();
        List<InstitucionSalud> salud = objSaludService.listarSalud();
        model.addAttribute("prevision", prevision);
        model.addAttribute("salud", salud);
        return "editarTrabajador";
    }

    @PostMapping("/actualizar/{idTrabajador}")
    public String actualizarTrabajador(@ModelAttribute Trabajador trabajador, @PathVariable int idTrabajador,
                                       @RequestParam("previsionId") int previsionId,
                                       @RequestParam("saludId") int saludId) {
        InstitucionPrevisional prevision = objPrevisionService.buscarPrevisionPorId(previsionId);
        InstitucionSalud salud = objSaludService.buscarSaludPorId(saludId);
        trabajador.setInstPrevision(prevision);
        trabajador.setInstSalud(salud);
        objTrabajadorService.actualizarTrabajador(trabajador, idTrabajador);
        return "redirect:/trabajador";
    }

    @GetMapping("/{idTrabajador}/eliminar")
    public String mostrarEliminarTrabajador(@PathVariable int idTrabajador, Model model){
        Trabajador trabajadorEliminar = objTrabajadorService.buscarTrabajadorPorId(idTrabajador);
        model.addAttribute("trabajador", trabajadorEliminar);
        return "eliminarTrabajador";
    }

    @PostMapping("/eliminar/{idTrabajador}")
    public String eliminarTrabajadorPorId(@PathVariable int idTrabajador) {
        objTrabajadorService.eliminarTrabajador2(idTrabajador);
        return "redirect:/trabajador";
    }
}
