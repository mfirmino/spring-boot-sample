package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email,
                         @RequestParam("telefone") String telefone, Model model){

        Convidado convidado = new Convidado(nome, email, telefone);
        repository.save(convidado);

        return listaConvidados(model);
    }
}
