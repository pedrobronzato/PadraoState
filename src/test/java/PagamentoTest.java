import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    Pagamento pagamento;

    @BeforeEach
    public void setUp(){
        pagamento = new Pagamento();
    }

    //Estado inicial criado

    @Test
    public void naoDeveCriarPagamentoCriado(){
        pagamento.setEstado(PagamentoEstadoCriado.getInstance());
        assertFalse(pagamento.criar());
    }


    @Test
    public void deveEnviarPagamentoCriado(){
        pagamento.setEstado(PagamentoEstadoCriado.getInstance());
        assertTrue(pagamento.enviar());
        assertEquals(PagamentoEstadoEnviado.getInstance(), pagamento.getEstado());
    }


    @Test
    public void deveRegistrarPagamentoEnviado(){
        pagamento.setEstado(PagamentoEstadoEnviado.getInstance());
        assertTrue(pagamento.registrar());
        assertEquals(PagamentoEstadoRegistrado.getInstance(), pagamento.getEstado());
    }

    @Test
    public void deveConciliarPagamentoRegistrado(){
        pagamento.setEstado(PagamentoEstadoRegistrado.getInstance());
        assertTrue(pagamento.conciliar());
        assertEquals(PagamentoEstadoConciliado.getInstance(), pagamento.getEstado());
    }

    @Test
    public void deveConcluirPagamentoConciliado(){
        pagamento.setEstado(PagamentoEstadoConciliado.getInstance());
        assertTrue(pagamento.concluir());
        assertEquals(PagamentoEstadoConcluido.getInstance(), pagamento.getEstado());
    }

    @Test
    public void naoDeveConcluirPagamentoEnviado(){
        pagamento.setEstado(PagamentoEstadoEnviado.getInstance());
        assertFalse(pagamento.concluir());
    }
    @Test
    public void naoDeveConcluirPagamentoRegistrado(){
        pagamento.setEstado(PagamentoEstadoRegistrado.getInstance());
        assertFalse(pagamento.concluir());
    }
    

}