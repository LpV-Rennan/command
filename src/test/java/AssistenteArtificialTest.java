import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssistenteArtificialTest {

    AssistenteArtificial assistente;
    LuzInteligente luz;

    @BeforeEach
    void setUp(){
        assistente = new AssistenteArtificial();
        luz = new LuzInteligente("luz do quarto");
    }

    @Test
    void deveRetornarLuzAcesa(){
        ComandoLuzLigar luzLigar = new ComandoLuzLigar(luz);
        assistente.executarComando(luzLigar);

        assertTrue(luz.getEstaLigado());
    }

    @Test
    void deveRetornarLuzApagada(){
        ComandoLuzDesligar luzDesligar = new ComandoLuzDesligar(luz);
        assistente.executarComando(luzDesligar);

        assertFalse(luz.getEstaLigado());
    }

    @Test
    void deveRetornarDesfazerOUltimoComando(){
        ComandoLuzDesligar luzDesligar = new ComandoLuzDesligar(luz);
        ComandoLuzLigar luzLigar = new ComandoLuzLigar(luz);

        assistente.executarComando(luzLigar);
        assertTrue(luz.getEstaLigado());

        assistente.executarComando(luzDesligar);
        assertFalse(luz.getEstaLigado());

        assistente.cancelarUltimoComando();
        assertTrue(luz.getEstaLigado());
    }


}