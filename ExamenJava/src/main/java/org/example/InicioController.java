package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/") // Mantener la ruta raíz
public class InicioController {

    @GetMapping("/inicio") // Cambiar el mapeo a /inicio
    public String mostrarInicio(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a la aplicación de tareas!");
        return "inicio"; // Nombre de la vista de inicio
    }

    @GetMapping("/test")
    public String test() {
        return "Test funcionando"; // Esto puede ser usado para pruebas
    }
}
