package devleofulco.scope;

import devleofulco.scope.App.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScopeApplication {

	public static void main(String[] args) {SpringApplication.run(ScopeApplication.class, args);}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema)throws Exception{
		return args->{
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
		};
	}

}
