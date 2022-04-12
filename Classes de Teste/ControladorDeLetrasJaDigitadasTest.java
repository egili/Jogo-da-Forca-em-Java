import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControladorDeLetrasJaDigitadasTest {

	private ControladorDeLetrasJaDigitadas controlador = null;

	@BeforeEach
	private void inicialize() throws Exception {
		controlador = new ControladorDeLetrasJaDigitadas();
	}
	
	@Test
	public void registrandoUmaLetra() throws Exception {
		controlador.registre('a');

		assertEquals(controlador.isJaDigitada('a'), true);
	}

	@Test
	public void registrandoUmaLetraNaoDigitada() throws Exception {
		controlador.registre('b');

		assertEquals(controlador.isJaDigitada('a'), false);
	}
	
	@Test
	public void copiando() throws Exception {
		ControladorDeLetrasJaDigitadas c = new ControladorDeLetrasJaDigitadas(controlador);
		
		assertEquals(controlador.equals(c), true);
	}
}
