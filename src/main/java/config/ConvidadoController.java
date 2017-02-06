package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mfirmino on 06/02/17.
 */
@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoRepository repository;

    @RequestMapping("/")
    public String boasVindas(){
	return "index";
    }

    @RequestMapping("/listaconvidados")
    public String listaConvidados(Model model){

        Iterable<Convidado> listaConvidados = repository.findAll();
        model.addAttribute("convidados", listaConvidados);

        return "listaconvidados";
    }
}
