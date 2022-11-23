public class PessoaFacade {

    public static String verificaComodo(Pessoa pessoa){
        if(Sala.getInstancia().checaPessoaNoComodo(pessoa)){
            return "sala";
        }
        if(Quarto.getInstancia().checaPessoaNoComodo(pessoa)){
            return "quarto";
        }
        return "não está em casa";
    }
}
