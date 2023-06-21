public class PagamentoEstadoCriado extends PagamentoEstado {

    private PagamentoEstadoCriado(){};

    private static PagamentoEstadoCriado instance = new PagamentoEstadoCriado();

    public static PagamentoEstadoCriado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Criado";
    }

    public boolean enviar(Pagamento pagamento){
        pagamento.setEstado(PagamentoEstadoEnviado.getInstance());
        return true;
    }


}
