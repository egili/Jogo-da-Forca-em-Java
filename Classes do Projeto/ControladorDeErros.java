// feito com ♥ por eliseu gili - 20669

public class ControladorDeErros implements Cloneable { // interface usada para poder sobrescrever o método clone()
	private int qtdMax, qtdErr = 0;

	public ControladorDeErros(int qtdMax) throws Exception {

		if (qtdMax < 0)
			throw new Exception("quantidade invalida");

		this.qtdMax = qtdMax;
	}

	public void registreUmErro() throws Exception {

		if (this.qtdErr == this.qtdMax)
			throw new Exception("quantidade invalida");

		this.qtdErr++;
	}

	public boolean isAtingidoMaximoDeErros() {

		return this.qtdErr == this.qtdMax;
	}

	@Override
	public String toString() {

		return this.qtdErr + "/" + this.qtdMax;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != ControladorDeErros.class)
			return false;

		ControladorDeErros other = (ControladorDeErros) obj;

		return this.qtdMax == other.qtdMax && this.qtdErr == other.qtdErr;
	}

	@Override
	public int hashCode() {
		int ret = 31;
		ret = ret * 13 + Integer.hashCode(this.qtdMax);
		ret = ret * 13 + Integer.hashCode(this.qtdErr);

		return ret < 0 ? -ret : ret;
	}

	// construtor de copia
	public ControladorDeErros(ControladorDeErros c) throws Exception {

		if (c == null)
			throw new Exception("Instância nula");

		this.qtdMax = c.qtdMax;
		this.qtdErr = c.qtdErr;
	}

	@Override
	public Object clone() {
		try {
			return new ControladorDeErros(this);
		} catch (Exception erro) {
			System.err.println("impossivel clonar");
			return null;
		}
	}
}
