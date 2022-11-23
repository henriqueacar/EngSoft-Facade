import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarPessoaNaSala(){
        Pessoa pessoa = new Pessoa("Maria");
        Sala.getInstancia().adicionaPessoaNoComodo(pessoa);

        assertEquals("Maria está na sala", "Maria está na "+pessoa.verificaComodo(pessoa));
    }

    @Test
    void deveRetornarPessoaNoQuarto(){
        Pessoa pessoa = new Pessoa("João");
        Quarto.getInstancia().adicionaPessoaNoComodo(pessoa);

        assertEquals("João está no quarto", "João está no "+pessoa.verificaComodo(pessoa));
    }

    @Test
    void deveRetornarPessoaNaoEncontrada(){
        Pessoa pessoa = new Pessoa("Ana");

        assertEquals("Ana não está em casa", "Ana " + pessoa.verificaComodo(pessoa));
    }
}