public class Local{

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Local{");
        sb.append(", setor='").append(setor).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
