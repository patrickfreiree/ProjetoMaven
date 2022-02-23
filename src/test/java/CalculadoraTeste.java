import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTeste {
	@Test
	public void testSoma(){
		Calculadora calculadora = new Calculadora(2,3);
		assertEquals(5.0, calculadora.soma(), 0.001);
	}

//	@Test
//	public void testeMenos(){
//		Calculadora calculadora = new Calculadora(4,4);
//		assertEquals(0.0, calculadora.soma(), 5);
//	}
		}
