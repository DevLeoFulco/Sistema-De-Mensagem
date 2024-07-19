package devleofulco.scope.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Remetente remetente(){
        System.out.println("Criando um Objeto Remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("testeleo@test.com.br");
        remetente.setNome("Dev Leo Fulco");

        return remetente;
    }
}
