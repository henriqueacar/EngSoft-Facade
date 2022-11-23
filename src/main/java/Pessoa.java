public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String verificaComodo(Pessoa pessoa){
        return PessoaFacade.verificaComodo(this);
    }

}
