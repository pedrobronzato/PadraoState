public class Pagamento {
    private int id;

    private PagamentoEstado estado;

    public Pagamento(){
        this.estado = PagamentoEstadoCriado.getInstance();
    }

    public void setEstado(PagamentoEstado estado){
        this.estado = estado;
    }

    public boolean criar() {
        return estado.criar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean conciliar() {
        return estado.conciliar(this);
    }

    public boolean registrar() {
        return estado.registrar(this);
    }

    public boolean concluir() {
        return estado.concluir(this);
    }

    public PagamentoEstado getEstado(){
        return estado;
    }

}
