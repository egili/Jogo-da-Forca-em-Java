import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalavraTest {

	Palavra palavra = null;
	
	@Test
	public void quantidade() throws Exception {
		palavra = new Palavra("java");

		int qtd = palavra.getQuantidade('a');
		
		assertEquals(2, qtd);		
	}
	
	@Test
	public void tamanho() throws Exception {
		palavra = new Palavra("java");
		
		int tamanho = palavra.getTamanho();
		
		assertEquals(4, tamanho);		
	}
	
	@Test
	public void iezimaOcorrencia() throws Exception {
		palavra = new Palavra("desenvolvimento");
		
		int posicao = palavra.getPosicaoDaIezimaOcorrencia(0, 'e');

		assertEquals(posicao, 1);
	}
}
