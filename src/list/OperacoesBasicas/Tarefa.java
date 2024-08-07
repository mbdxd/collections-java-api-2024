package list.OperacoesBasicas;

public class Tarefa {
    //atribute
    private String Descricao;

    public Tarefa(String descricao) {
        Descricao = descricao;
    }

    public String getDescricao() {
        return Descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "Descricao='" + Descricao + '\'' +
                '}';
    }
}
