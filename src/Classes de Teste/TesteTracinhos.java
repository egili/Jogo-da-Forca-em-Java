//feito com ♥ por eliseu gili - 20669
public class TesteTracinhos {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("teste 1: funcionamento do construtor e toString");
			
			Tracinhos tracinhos = new Tracinhos(5);
			System.out.println("5 tracinhos foram construídos: " + tracinhos.toString() + "\n"); 
			
		} catch (Exception e) {
			
			System.err.println("Não foi possível construir um objeto da classe Tracinhos \n");
		}
		
		try {
			System.out.println("teste 2: chamando o método revele()");
			
			Tracinhos tracinhos = new Tracinhos(4);
			
			tracinhos.revele(0, 'J');
			tracinhos.revele(1, 'A');
			tracinhos.revele(2, 'V'); // 3 letras reveladas
			
			System.out.println("Foram passados 4 tracinhos e 3 letras foram reveladas: " + tracinhos.toString() + "\n");
		
		} catch (Exception e) {
		
			System.err.println(e.getMessage() + "\n");
		}
		
		try {
			System.out.println("teste 3: construtor com paramêtro negativo");
			
			Tracinhos tracinhos = new Tracinhos(-5);
			System.out.println("Foi possível construir com número negativo: " + tracinhos.toString() + "\n");
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage() + "\n");
		}
		
		try {
			System.out.println("teste 4: chamando método revele com posicao com paramêtro negativo");
			
			Tracinhos tracinhos = new Tracinhos(5);
			
			tracinhos.revele(-2, 'a');
			
			System.out.println(tracinhos.toString() + "\n");
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage() + "\n");
		}
	}
}
