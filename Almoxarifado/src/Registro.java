import java.util.List;

public class Registro {

    private List<Pedido> historico;

    public List<Pedido> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Pedido> historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Registro{");
        sb.append("historico =").append(historico);
        sb.append('}');
        return sb.toString();
    }
}
