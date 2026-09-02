public class ControladorDeLetrasJaDigitadas implements Cloneable {
	private String letrasJaDigitadas;

	public ControladorDeLetrasJaDigitadas() {
		this.letrasJaDigitadas = "";
	}

	public boolean isJaDigitada(char letra) {
		return this.letrasJaDigitadas.indexOf(letra) != -1;
	}

	public void registre(char letra) throws Exception {
		if (isJaDigitada(letra))
			throw new Exception("Letra ja digitada");

		if (Character.isDigit(letra)) {
			throw new Exception("não pode ser numero");
		}

		this.letrasJaDigitadas = this.letrasJaDigitadas + letra;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
			sb.append(letrasJaDigitadas.charAt(i)).append(",");
		}
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != ControladorDeLetrasJaDigitadas.class)
			return false;

		ControladorDeLetrasJaDigitadas other = (ControladorDeLetrasJaDigitadas) obj;
		return this.letrasJaDigitadas.equals(other.letrasJaDigitadas);
	}

	@Override
	public int hashCode() {
		return letrasJaDigitadas != null ? letrasJaDigitadas.hashCode() : 0;
	}

	public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas c) throws Exception {
		if (c == null)
			throw new Exception("c era null");
		this.letrasJaDigitadas = c.letrasJaDigitadas;
	}

	@Override
	public Object clone() {
		try {
			return new ControladorDeLetrasJaDigitadas(this);
		} catch (Exception ignored) {
			return null;
		}
	}
}
