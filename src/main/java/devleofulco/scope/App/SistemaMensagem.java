package devleofulco.scope.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    @Autowired
    private Remetente noreplay;

    @Autowired
    private Remetente teamTech;


    public void enviarConfirmacaoCadastro(){
        System.out.println(noreplay);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        teamTech.setEmail("teste@test.com.br");
        System.out.println(teamTech);
        System.out.println("Bem vindo ao Casa do Javeiro");
    }
}
