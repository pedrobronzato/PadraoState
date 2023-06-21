public class PagamentoEstadoConciliado extends PagamentoEstado {

    private PagamentoEstadoConciliado(){};

    private static PagamentoEstadoConciliado instance = new PagamentoEstadoConciliado();

    public static PagamentoEstadoConciliado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Conciliado";
    }


    public boolean concluir(Pagamento pagamento){
        pagamento.setEstado(PagamentoEstadoConcluido.getInstance());
        return true;
    }
}
