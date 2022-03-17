package es.ucm.fdi.iw.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  Non-authenticated requests only.
 */
@Controller
public class RootController {

	private static final Logger log = LogManager.getLogger(RootController.class);

	@GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/registro")
    public String registro(Model model) {
        return "registro";
    }

	@GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/atencion-cliente")
    public String atencionCliente(Model model) {
        return "atencionClienteUser";
    }

    @GetMapping("/entradas/67G5HJ4F")
    public String resumenEntradas(Model model) {
        return "resumenEntrada";
    }

}
