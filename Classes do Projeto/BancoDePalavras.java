public class BancoDePalavras {
	private static String[] palavras = {
		"JAVA", "CLASSE", "OBJETO", "INSTANCIA", "PUBLICO", "PRIVATIVO", "METODO",
		"CONSTRUTOR", "SETTER", "GETTER", "LUZ", "PRAZER",
		"INTERFACES", "POLIMORFISMO", "ENCAPSULAMENTO", "HERANCA", "ABSTRACAO", "GENERICOS", "EXCECOES", "COLLECTIONS", "STREAM", "LAMBDA", "COMPILADOR",
		"ALGORITMO", "RECURSIVIDADE", "ESTRUTURA", "VARIAVEL", "CONSTANTE", "ITERACAO", "BINARIO", "HEXADECIMAL", "PROGRAMACAO",
		"CANGURU", "ORNITORRINCO", "ESTRATOSFERA", "SINCRONIZACAO", "CONSTITUICAO", "PARALELISMO", "SISTEMATICA"
	};

	public static Palavra getPalavraSorteada() {
		Palavra palavra = null;

		try {
			palavra = new Palavra(BancoDePalavras.palavras[(int) (Math.random() * BancoDePalavras.palavras.length)]);
		} catch (Exception e) {
		}

		return palavra;
	}
}
