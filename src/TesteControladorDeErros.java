// feito com ♥ por eliseu gili - 20669

public class TesteControladorDeErros {

	public static void main(String[] args) {

		try { 
			
			System.out.println("teste 1: registrando erros sem esgotar as chances");
			ControladorDeErros testeControladorDeErros = new ControladorDeErros(10); // instancia um novo ControladorDeErros que aceita até 10 erros
			
			testeControladorDeErros.registreUmErro();
			testeControladorDeErros.registreUmErro(); // dois erros estão registrados
			
			System.out.println("é " + testeControladorDeErros.isAtingidoMaximoDeErros() + " que não temos mais chances ");
			System.out.println( testeControladorDeErros.toString() + ", ou seja, teste 1 teve resultado positivo \n"); 

		} catch (Exception e) {
			
			System.err.println("teste 1 teve resultado negativo \n");
		}
		
		try {
			
			System.out.println("teste 2: registrando erros e esgotando as chances");
			ControladorDeErros testeControladorDeErros = new ControladorDeErros(3); // o novo ControladorDeErros aceita até 3 erros
			
			testeControladorDeErros.registreUmErro();
			testeControladorDeErros.registreUmErro();
			testeControladorDeErros.registreUmErro(); // chegou no limite de erros
			
			System.out.println("é " + testeControladorDeErros.isAtingidoMaximoDeErros() + " que não temos mais chances ");
			System.out.println(testeControladorDeErros.toString() + ", ou seja, teste 2 teve resultado positivo \n"); 
			
		} catch (Exception e) {
			
			System.err.println("teste 2 teve resultado negativo \n");
		}
		
		try {
			
			System.out.println("teste 3: passado null como paramêtro de número de chances");
			ControladorDeErros testeControladorDeErros = new ControladorDeErros(null); // o novo ControladorDeErros aceita null número de erros  
			
			testeControladorDeErros.registreUmErro();
			
			System.out.println("temos chances? " + testeControladorDeErros.isAtingidoMaximoDeErros() + ", ou seja, conseguimos ter null número de chances! \n");
			
		} catch (Exception e) {
			
			System.err.println("não é possivel ter null número de chances \n");
		}
		
		try {
			
			System.out.println("teste 4: funcionalidade do construtor de cópia");
			
			ControladorDeErros testeControladorDeErros = new ControladorDeErros(5);
			ControladorDeErros copiaTesteControladorDeErros = new ControladorDeErros(testeControladorDeErros);
			
			System.out.println("construtor de cópia está funcionando? " + testeControladorDeErros.equals(copiaTesteControladorDeErros) + "\n");
			
		} catch (Exception e) {
			
			System.err.println("construtor de cópia não está funcionando \n");
		}
		
		try {
			
			System.out.println("teste 5: numero de chances menor que zero");
			
			ControladorDeErros testeControladorDeErros = new ControladorDeErros(-5); //exceção com tratamento
			
			testeControladorDeErros.registreUmErro();
			
			System.out.println("é " + testeControladorDeErros.isAtingidoMaximoDeErros() + " que não temos mais chances ");
			System.out.println( testeControladorDeErros.toString() + ", ou seja, teste 1 teve resultado negativo \n"); 
		
		} catch (Exception e) {
			
			System.err.println("não existem chances negativas, resultado positivo \n");
		}
		
		try {
			
			System.out.println("teste 6: excedendo o numero de chances");
			
			ControladorDeErros testeControladorDeErros = new ControladorDeErros(3); //aceita 3 erros
			
			testeControladorDeErros.registreUmErro();
			testeControladorDeErros.registreUmErro();
			testeControladorDeErros.registreUmErro();
			testeControladorDeErros.registreUmErro(); // 4 erros registrados
			
			System.out.println("atingimos o numero maximo de chances? " + testeControladorDeErros.isAtingidoMaximoDeErros());
			System.out.println("se isso for printado, o programa tem erro: " + testeControladorDeErros.toString() + "\n");
			
		} catch (Exception e) {
			
			System.err.println("as chances não podem ser excedidas \n");
		}
		
		try {
			
			System.out.println("teste 7: passando um char como paramêtro para o construtor");
			
			ControladorDeErros testeControladorDeErros = new ControladorDeErros('a'); 
			
			testeControladorDeErros.registreUmErro();
			testeControladorDeErros.registreUmErro(); // 2 erros registrados
			
			System.out.println("o char 'a' passado como paramêtro para o teste representa o número " + (int)'a' + " após a conversão para int");
			System.out.println("ou seja temos " + (int)'a' + " chances");
			System.out.print(testeControladorDeErros.toString() + " -> ");
			System.out.println("o que representa " + testeControladorDeErros.isAtingidoMaximoDeErros() + " que não temos mais chances \n");
			
			} catch (Exception e) {
				
			System.err.println("um char não pode ser o paramêtro que representa o número de chances \n");
		}
	}
}