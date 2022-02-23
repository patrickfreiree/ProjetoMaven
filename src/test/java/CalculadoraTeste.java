import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTeste {
	@Test
	public void testSoma(){
		Calculadora calculadora = new Calculadora(2,3);
		assertEquals(5.0, calculadora.soma(), 0.001);

	}
}
