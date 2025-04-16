
import model.Retangulo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RetanguloTest {

    @Test
    void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 3;
        Retangulo retangulo = new Retangulo("", base, altura);
        double retornoFeito = retangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);

    }
}
