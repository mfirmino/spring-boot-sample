package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.TimeZone;

/**
 * Created by marcelofirmino on 31/10/16.
 */
@SpringBootApplication
public class Configuracao {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        SpringApplication.run(Configuracao.class, args);
    }

    @Bean
    public DataSource dataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/listavip"
                                          + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=America/Sao_Paulo");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }

}
