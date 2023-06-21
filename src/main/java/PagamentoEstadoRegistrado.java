public class PagamentoEstadoRegistrado extends PagamentoEstado {


    private PagamentoEstadoRegistrado(){};

    private static PagamentoEstadoRegistrado instance = new PagamentoEstadoRegistrado();

    public static PagamentoEstadoRegistrado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Registrado";
    }


    public boolean conciliar(Pagamento pagamento){
        pagamento.setEstado(PagamentoEstadoConciliado.getInstance());
        return true;
    }
}
