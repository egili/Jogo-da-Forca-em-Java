
public class TestePalavra {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("teste 1 : Funcionalidade do construtor");
			Palavra palavra = new Palavra("Java");
			
			System.out.println(palavra.getClass() + " construida com sucesso com a String: " + palavra + "\n");
			
		}
		catch(Exception e) {
			
			System.err.println("Não foi possível construir um objeto da classe Palavra \n");
		}
		
		try {
			
			System.out.println("teste 2 : Recuperando a quantidade de letras iguais a fornecida");
			
			Palavra p = new Palavra("pneumoultramicroscópicosilicovulcanoconeótico");
			
			System.out.println("A palavra \"" + p + "\" tem " + p.getQuantidade('o')+ " ocorrências da letra \"o\" \n");
		} 
		catch (Exception e) {
			
			System.err.println("Não foi possível encontrar letras iguais à fornecida \n");
		}
		
		try {
			
			System.out.println("teste 3 : recuperando a iézima ocorrência de determinada letra da Palavra instanciada");
			
			Palavra palavra = new Palavra("pneumoultramicroscopicossilicovulcanoconiótico");
			System.out.println("Palavra instanciada: " + palavra + "\n");
			
			System.out.println("a primeira ocorrência da letra \'o\' na Palavra instanciada é na posição: " + palavra.getPosicaoDaIezimaOcorrencia(0, 'o') ); 
			System.out.println("a segunda ocorrência da letra \'o\' na Palavra instanciada é na posição: " + palavra.getPosicaoDaIezimaOcorrencia(1, 'o') ); 
			System.out.println("a terceira ocorrência da letra \'o\' na Palavra instanciada é na posição: " + palavra.getPosicaoDaIezimaOcorrencia(2, 'o') + "\n");
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage() + "\n");
			
		}
		
		try {
			
			System.out.println("teste 4: construtor com paramêtro null");
			
			Palavra palavra = new Palavra(null);
			
			System.out.println("Palavra instanciada: " + palavra + "\n");
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage() + "\n");
		}
		
		try {
			
			System.out.println("teste 5: recuperando o tamanho da palavra instanciada");
			
			Palavra palavra = new Palavra("pneumoultramicroscopicossilicovulcanoconiótico");
			
			System.out.println("o tamanho da Palavra \"" + palavra.toString() + "\" é " + palavra.getTamanho());
			
		} catch (Exception e) {
			
			System.err.println("não foi possível recuperar o tamanho da Palavra");
		}
		
		try {
			
		} catch (Exception e) {
		
		}
	}
	

}
