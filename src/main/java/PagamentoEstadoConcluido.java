public class PagamentoEstadoConcluido extends PagamentoEstado {

    private PagamentoEstadoConcluido(){};

    private static PagamentoEstadoConcluido instance = new PagamentoEstadoConcluido();

    public static PagamentoEstadoConcluido getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Concluido";
    }
}
