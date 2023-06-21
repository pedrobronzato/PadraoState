public class PagamentoEstadoEnviado extends PagamentoEstado {

    private PagamentoEstadoEnviado(){};

    private static PagamentoEstadoEnviado instance = new PagamentoEstadoEnviado();

    public static PagamentoEstadoEnviado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Enviado";
    }

    public boolean registrar(Pagamento pagamento){
        pagamento.setEstado(PagamentoEstadoRegistrado.getInstance());
        return true;
    }

}
