package Model;

public class Ingresso {

    private TipoIngresso tipo;
    private double preco;
    private Sessao sessao;
    private Cliente cliente;
    private Funcionario funcionario;

    public Ingresso() {
    }

    public Ingresso(TipoIngresso tipo, double preco, Sessao sessao, Cliente cliente, Funcionario funcionario) {
        this.tipo = tipo;
        this.preco = preco;
        this.sessao = sessao;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "tipo=" + tipo +
                ", preco=" + preco +
                ", cliente=" + (cliente != null ? cliente.getNome() : null) +
                ", funcionario=" + (funcionario != null ? funcionario.getNome() : null) +
                '}';
    }
}

