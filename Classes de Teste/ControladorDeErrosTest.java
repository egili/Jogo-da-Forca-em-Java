import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControladorDeErrosTest {

	private ControladorDeErros controlador = null;

	@BeforeEach
	private void inicialize() throws Exception {
		controlador = new ControladorDeErros(1);
	}
	
	@Test
	public void registrandoUmErroDeCinco() throws Exception {
		assertEquals(!controlador.isAtingidoMaximoDeErros(), true);
	}

	@Test
	public void NumeroDeChancesMenorQueZero() throws Exception {
		assertThrows(Exception.class, () -> controlador = new ControladorDeErros(-1));
	}

	@Test
	public void registrandoUmErroDeUm() throws Exception {
		controlador.registreUmErro();

		assertEquals(controlador.isAtingidoMaximoDeErros(), true);
	}

	@Test
	public void excedendoONumeroDeChances() throws Exception {
		controlador.registreUmErro();

		assertThrows(Exception.class, () -> controlador.registreUmErro());
	}

	@Test
	public void construtorComParametroNegativo() {
		assertThrows(Exception.class, () -> controlador = new ControladorDeErros(null));
	}

	@Test
	public void copiando() throws Exception {
		ControladorDeErros c = new ControladorDeErros(controlador);

		assertEquals(controlador.equals(c), true);
	}
	
	@Test
	public void clonando() throws Exception{
		ControladorDeErros c = (ControladorDeErros) controlador.clone();
		
		assertEquals(controlador.equals(c), true);
	}
}
