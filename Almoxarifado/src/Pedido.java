import java.util.Date;

public class Pedido {

    protected Estoque produto;
    protected Local local;
    private String nome;
    private String pedido;
    private Date data;
    private int opcao;
    private boolean saida;
    private boolean entrada;

    public Pedido(Estoque produto, Local local, String nome, String pedido, int opcao) {
        this.produto = produto;
        this.local = local;
        this.nome = nome;
        this.pedido = pedido;
        this.opcao = opcao;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Date getData() {
        return data;
    }

    public void setData() {
        this.data = new Date();
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public boolean isSaida() {
        return saida;
    }

    public void setSaida(boolean saida) {
        this.saida = saida;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estoque getProduto() {
        return produto;
    }

    public void setProduto(Estoque produto) {
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pedido{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", opcao=").append(opcao);
        sb.append(", produto=").append(produto);
        sb.append(", saida=").append(saida);
        sb.append(", entrada=").append(entrada);
        sb.append(", data=").append(data);
        sb.append(", pedido='").append(pedido).append('\'');
        sb.append(", local=").append(local);
        sb.append('}');
        return sb.toString();
    }
}
