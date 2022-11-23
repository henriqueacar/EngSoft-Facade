import java.util.ArrayList;
import java.util.List;

public abstract class Casa {
    private List<Pessoa> pessoasNoComodo = new ArrayList<>();

    public void adicionaPessoaNoComodo(Pessoa pessoa){
        this.pessoasNoComodo.add(pessoa);
    }

    public boolean checaPessoaNoComodo(Pessoa pessoa){
        return this.pessoasNoComodo.contains(pessoa);
    }

}
