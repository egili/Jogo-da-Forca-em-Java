
public class TestePalavra {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("teste 1 : Funcionalidade do construtor");
			Palavra palavra = new Palavra("Java");
			
			System.out.println(palavra.getClass() + " construida com sucesso com a String: " + palavra + "\n");
			
		}
		catch(Exception e) {
			
			System.err.println("N�o foi poss�vel construir um objeto da classe Palavra \n");
		}
		
		try {
			
			System.out.println("teste 2 : Recuperando a quantidade de letras iguais a fornecida");
			
			Palavra p = new Palavra("pneumoultramicrosc�picosilicovulcanocone�tico");
			
			System.out.println("A palavra \"" + p + "\" tem " + p.getQuantidade('o')+ " ocorr�ncias da letra \"o\" \n");
		} 
		catch (Exception e) {
			
			System.err.println("N�o foi poss�vel encontrar letras iguais � fornecida \n");
		}
		
		try {
			
			System.out.println("teste 3 : recuperando a i�zima ocorr�ncia de determinada letra da Palavra instanciada");
			
			Palavra palavra = new Palavra("pneumoultramicroscopicossilicovulcanoconi�tico");
			System.out.println("Palavra instanciada: " + palavra + "\n");
			
			System.out.println("a primeira ocorr�ncia da letra \'o\' na Palavra instanciada � na posi��o: " + palavra.getPosicaoDaIezimaOcorrencia(0, 'o') ); 
			System.out.println("a segunda ocorr�ncia da letra \'o\' na Palavra instanciada � na posi��o: " + palavra.getPosicaoDaIezimaOcorrencia(1, 'o') ); 
			System.out.println("a terceira ocorr�ncia da letra \'o\' na Palavra instanciada � na posi��o: " + palavra.getPosicaoDaIezimaOcorrencia(2, 'o') + "\n");
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage() + "\n");
			
		}
		
		try {
			
			System.out.println("teste 4: construtor com param�tro null");
			
			Palavra palavra = new Palavra(null);
			
			System.out.println("Palavra instanciada: " + palavra + "\n");
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage() + "\n");
		}
		
		try {
			
			System.out.println("teste 5: recuperando o tamanho da palavra instanciada");
			
			Palavra palavra = new Palavra("pneumoultramicroscopicossilicovulcanoconi�tico");
			
			System.out.println("o tamanho da Palavra \"" + palavra.toString() + "\" � " + palavra.getTamanho());
			
		} catch (Exception e) {
			
			System.err.println("n�o foi poss�vel recuperar o tamanho da Palavra");
		}
		
		try {
			
		} catch (Exception e) {
		
		}
	}
	

}
