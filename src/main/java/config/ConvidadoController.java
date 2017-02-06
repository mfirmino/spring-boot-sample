package config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mfirmino on 06/02/17.
 */
@Controller
public class ConvidadoController {

    @RequestMapping("/")
    public String boasVindas(){
	return "index";
    }
}
