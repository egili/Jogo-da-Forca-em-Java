import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TracinhosTest {

	private Tracinhos tracinhos = null;

	@Test
	public void reveleTest() throws Exception {

		tracinhos = new Tracinhos(5);
		tracinhos.revele(0, 'a');
		tracinhos.revele(1, 'a');
		tracinhos.revele(2, 'a');
		tracinhos.revele(3, 'a');

		assertEquals(tracinhos.toString().charAt(2), 'a');
		assertEquals(tracinhos.isAindaComTracinhos(), true);
	}

	@Test
	public void reveleInvalidoTest() throws Exception {

		tracinhos = new Tracinhos(5);
		assertThrows(Exception.class, () -> tracinhos.revele(6, 'a'));
	}

	@Test
	public void reveleComParametroNegativo() throws Exception {

		tracinhos = new Tracinhos(5);
		assertThrows(Exception.class, () -> tracinhos.revele(-1, 'a'));
	}

	@Test
	public void copiando() throws Exception {

		tracinhos = new Tracinhos(5);

		Tracinhos t = new Tracinhos(tracinhos);

		assertEquals(tracinhos.equals(t), true);
	}

	@Test
	public void construtorComParametroNegativo() {
		assertThrows(Exception.class, () -> tracinhos = new Tracinhos(-1));
	}
}
