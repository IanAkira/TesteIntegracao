
import model.Desenho;
import model.Retangulo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DesenhoTest {

    @Test
    void testAdicionar() {
        //Objeto desenho a ser testado
        Desenho desenho = new Desenho();

        //Insere uma figura do tipo retângulo
        double alturaRetangulo = 3;
        double baseRetangulo = 2;
        Retangulo retangulo = new Retangulo("",
                baseRetangulo, alturaRetangulo);

        desenho.adicionar(retangulo);

        assertEquals(1, desenho.getFiguras().size());
    }
}
