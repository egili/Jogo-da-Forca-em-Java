import java.util.Arrays;

public class Tracinhos implements Cloneable {
	private char texto[];

	public Tracinhos(int qtd) throws Exception {

		if (qtd < 0)
			throw new Exception("quantidade precisa ser positiva");

		this.texto = new char[qtd];

		for (int i = 0; i < this.texto.length; i++)
			this.texto[i] = '_';
	}

	public void revele(int posicao, char letra) throws Exception {
		if (posicao < 0 || posicao >= this.texto.length)
			throw new Exception("posicao inválida");

		this.texto[posicao] = letra;
	}

	public boolean isAindaComTracinhos() {
		for (int i = 0; i < this.texto.length; i++) {
			if (this.texto[i] == '_')
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.texto.length; i++) {
			sb.append(texto[i]).append(" ");
		}
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != Tracinhos.class)
			return false;

		Tracinhos tracinhos = (Tracinhos) obj;
		return Arrays.equals(this.texto, tracinhos.texto);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(this.texto);
	}

	public Tracinhos(Tracinhos t) throws Exception { // construtor de cópia
		if (t == null)
			throw new Exception("A instância não pode estar nula");

		this.texto = t.texto.clone();
	}

	@Override
	public Object clone() {
		try {
			return new Tracinhos(this);
		} catch (Exception e) {
			return null;
		}
	}
}
