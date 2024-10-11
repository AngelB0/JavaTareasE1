package org.example;

import org.example.repository.TareaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TareaController {

    @Autowired
    private TareaMapper tareaMapper; // Inyectar el mapper

    @GetMapping("/nueva-tarea")
    public String mostrarFormularioTarea(Model model) {
        model.addAttribute("tarea", new Tarea());
        return "nueva-tarea"; // Nombre de la vista del formulario
    }

    @PostMapping("/guardar-tarea")
    public String guardarTarea(@ModelAttribute Tarea tarea) {
        tareaMapper.insertarTarea(tarea); // Usar el mapper para insertar
        return "redirect:/"; // Redirige a la página de inicio
    }

    @GetMapping("/")
    public String mostrarInicio(Model model) {
        return "redirect:/inicio"; // Redirigir a la nueva ruta
    }

    @GetMapping("/listado-tareas")
    public String mostrarListadoTareas(Model model) {
        List<Tarea> tareas = tareaMapper.obtenerTareas(); // Usar el mapper para obtener tareas
        model.addAttribute("tareas", tareas); // Pasar la lista de tareas a la vista
        return "listado-tareas"; // Nombre de la vista del listado
    }
}