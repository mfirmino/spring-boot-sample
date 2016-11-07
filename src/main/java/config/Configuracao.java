package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by marcelofirmino on 31/10/16.
 */
@SpringBootApplication
@Controller
public class Configuracao {

    public static void main(String[] args) {
        SpringApplication.run(Configuracao.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String boasVindas(){
        return "<h1>Olá. Bem-vindo ao sistema Lista VIP</h1>";
    }

}
