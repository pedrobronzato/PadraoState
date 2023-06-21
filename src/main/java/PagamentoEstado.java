public abstract class PagamentoEstado {

    public abstract String getEstado();

    public  boolean criar(Pagamento pagamento){
        return false;
    }

    public boolean enviar(Pagamento pagamento) {
        return false;
    }
    public boolean registrar(Pagamento pagamento) {
        return false;
    }

    public boolean conciliar(Pagamento pagamento) {
        return false;
    }
    public boolean concluir(Pagamento pagamento) {
        return false;
    }
}

