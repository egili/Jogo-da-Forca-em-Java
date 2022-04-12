import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ControladorDeLetrasJaDigitadasTest {

	public ControladorDeLetrasJaDigitadas controlador = null;

	@Test
	public void registrandoUmaLetra() throws Exception {

		controlador = new ControladorDeLetrasJaDigitadas();

		controlador.registre('a');

		assertEquals(controlador.isJaDigitada('a'), true);
	}

	@Test
	public void registrandoUmaLetraNaoDigitada() throws Exception {

		controlador = new ControladorDeLetrasJaDigitadas();

		controlador.registre('b');

		assertEquals(controlador.isJaDigitada('a'), false);
	}
	
	@Test
	public void copiando() throws Exception {
		controlador = new ControladorDeLetrasJaDigitadas();
		 
		ControladorDeLetrasJaDigitadas c = new ControladorDeLetrasJaDigitadas(controlador);
		
		assertEquals(controlador.equals(c), true);
	}
}
