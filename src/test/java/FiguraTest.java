

import model.Retangulo;
import model.Figura;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FiguraTest {

    @Test
    void testGetCor() {
        String retornoEsperado = "Verde";
        Figura retangulo = new Retangulo();
        retangulo.setCor("Verde");
        assertEquals(retornoEsperado, retangulo.getCor());
    }
}
