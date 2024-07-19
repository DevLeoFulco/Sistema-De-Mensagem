# Spring Boot Scope: Singleton vs Prototype

## O que é Scope no Spring Boot?

No contexto do Spring Framework, o "scope" define o ciclo de vida e a visibilidade dos objetos de bean dentro do contêiner de IoC (Inversão de Controle). O Spring fornece diferentes tipos de escopos que podem ser usados para diferentes cenários, sendo os mais comuns o Singleton e o Prototype.

## Scope Singleton

### Definição

O escopo Singleton é o padrão no Spring, o que significa que apenas uma instância do bean é criada e compartilhada em toda a aplicação. Toda vez que uma instância do bean é necessária, o contêiner do Spring fornece a mesma instância.

### Exemplo com Singleton

No código fornecido, a classe `SistemaMensagem` possui dependências que são beans Singleton por padrão.

```java
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
```

Neste exemplo, `noreplay` e `teamTech` são beans Singleton. Eles são instanciados uma vez e reutilizados.

## Scope Prototype

### Definição

O escopo Prototype cria uma nova instância do bean toda vez que ele é solicitado. Isso é útil quando você precisa de uma nova instância para cada uso.

### Exemplo com Prototype

No código fornecido, configuramos o bean `Remetente` como Prototype na classe `Beans`.

```java
package devleofulco.scope.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criando um Objeto Remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("testeleo@test.com.br");
        remetente.setNome("Dev Leo Fulco");

        return remetente;
    }
}
```

Neste exemplo, cada vez que o bean `remetente` é solicitado, uma nova instância é criada e configurada.

## Importância de Entender Scopes

Entender os diferentes escopos no Spring é crucial para o design de aplicativos eficientes e escaláveis. Utilizar o escopo correto pode impactar significativamente o desempenho e a utilização de recursos da aplicação.

## Facilidade em Criar Scopes com Spring Boot

O Spring Boot simplifica a criação e gerenciamento de escopos de beans. Com simples anotações como `@Scope` e `@Component`, podemos facilmente definir e gerenciar o ciclo de vida dos nossos beans, facilitando o desenvolvimento de aplicações robustas.

## Mensagem de Gratidão

Gostaria de expressar minha gratidão por todos os ensinamentos e oportunidades de aprendizado com o Spring Boot. É uma ferramenta que utilizo com muita frequencia e que facilita enormemente o desenvolvimento de aplicações complexas, e tenho certeza de que continuará a ser uma parte essencial do meu conjunto de habilidades de desenvolvimento.

---
