import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ControladorDeErrosTest {

	ControladorDeErros controlador = null;

	@Test
	public void registrandoUmErroDeCinco() throws Exception {
		controlador = new ControladorDeErros(5);

		controlador.registreUmErro();

		assertEquals(!controlador.isAtingidoMaximoDeErros(), true);
	}

	@Test
	public void registrandoUmErroDeUm() throws Exception {
		controlador = new ControladorDeErros(1);

		controlador.registreUmErro();

		assertEquals(controlador.isAtingidoMaximoDeErros(), true);
	}

	@Test
	public void copiando() throws Exception{
		controlador = new ControladorDeErros(1);
		
		ControladorDeErros c = new ControladorDeErros(controlador);
		
		assertEquals(controlador.equals(c), true);
	}
	
//	@Test
//	public void clonando() throws Exception{
//		controlador = new ControladorDeErros(1);
//		
//		ControladorDeErros c = (ControladorDeErros) controlador.clone();
//		
//		assertEquals(controlador.equals(c), true);
//	}
}
