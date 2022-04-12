import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalavraTest {

	private Palavra palavra = null;

	@BeforeEach
	private void inicialize() throws Exception {
		palavra = new Palavra("java");
	}
	
	@Test
	public void quantidade() {
		int qtd = palavra.getQuantidade('a');

		assertEquals(2, qtd);
	}

	@Test
	public void construtorParametroNull() {
		assertThrows(Exception.class, () -> palavra = new Palavra(null));
	}

	@Test
	public void tamanho() {
		int tamanho = palavra.getTamanho();

		assertEquals(4, tamanho);
	}

	@Test
	public void iezimaOcorrencia() throws Exception {
		int posicao = palavra.getPosicaoDaIezimaOcorrencia(0, 'a');

		assertEquals(posicao, 1);
	}
}
