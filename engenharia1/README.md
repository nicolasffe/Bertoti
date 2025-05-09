# PRIMEIRO TEXTO
What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices

# Resumo 1:
O trecho aborda algumas diferenças entre a nomenclatura da Ciência da Computação e da Engenharia de Software. O termo "Engenharia de Software" transmite mais seriedade, pois remete a outras engenharias essenciais para o mundo, que seguem diretrizes rigorosas e baseadas em dados, visto que quaisquer erros podem causar danos reais. Embora, à primeira vista, um erro na Engenharia de Software possa não parecer tão crítico, essa área se tornou indispensável nos dias atuais, tornando essencial a consideração dos impactos desses erros.

# SEGUNDO TEXTO
Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
 
One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
 
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
 
Time and Change
How code will need to adapt over the length of its life
 
Scale and Growth
How an organization will need to adapt as it evolves
 
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth

# Resumo 2:
O trecho aborda as ferramentas essenciais para a manutenção de um código na Engenharia de Software, além de refletir sobre as estratégias que um programador pode adotar para manter o código sustentável e valioso ao longo do tempo. Também são mencionados três princípios fundamentais que as organizações de software devem considerar ao projetar, arquitetar e desenvolver seus códigos: Tempo e Mudança, Escala e Crescimento, e Compensações e Custos.

# Exemplos de trade-off:
# Simplicidade x Escabilidade:
Uma estrutura de software simples pode gerar menos gastos, pois é mais fácil de controlar e manter. No entanto, à medida que a escalabilidade se torna necessária, essa estrutura tende a ficar mais complexa.

# Custo de desenvolvimento x Funcionalidade:
Um código simples pode ser mais fácil de manter, mas pode oferecer funcionalidades limitadas. Entretanto, ao adicionar novas funcionalidades, o tempo de desenvolvimento e os custos aumentam.

# Segurança x Usabilidade:
Sistemas altamente seguros geralmente exigem autenticações rigorosas, múltiplos fatores de verificação e restrições de acesso, o que pode dificultar a experiência do usuário. Por outro lado, tornar um sistema mais fácil de usar, reduzindo etapas de autenticação, pode comprometer sua segurança.

# Resumo do slide 57
Na entrega de um produto ou código, o essencial é a funcionalidade. Uma versão simples, mas útil, facilita a validação, aprimoramentos e evolução contínua.

#Atividade 5 - AGENDA
#TesteAgenda.java
package agenda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteAgenda {

    @Test
    void testAdicionarEListarContatos() {
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("Ana", "1234-5678"));
        agenda.adicionarContato(new Contato("João", "9876-5432"));

        assertEquals(2, agenda.getContatos().size());
    }

    @Test
    void testBuscarContatoPorNome() {
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("Carlos", "1111-2222"));

        Contato contato = agenda.buscarPorNome("Carlos");
        assertNotNull(contato);
        assertEquals("1111-2222", contato.getTelefone());
    }

    @Test
    void testBuscarContatoInexistente() {
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("Lucas", "5555-6666"));

        Contato contato = agenda.buscarPorNome("Maria");
        assertNull(contato);
    }
}

#Agenda.java
package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscarPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}

#Contato.java
package agenda;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}


