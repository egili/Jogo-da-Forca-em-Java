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
		else
			this.qtdErr++;
	}

	public boolean isAtingidoMaximoDeErros() {

		if (this.qtdErr == this.qtdMax)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {

		return this.qtdErr + "/" + this.qtdMax;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj.getClass() != ControladorDeErros.class)
			return false;

		ControladorDeErros controladorErros = (ControladorDeErros) obj;

		if (this.qtdMax != controladorErros.qtdMax)
			return false;
		if (this.qtdErr != controladorErros.qtdErr)
			return false;

		return true;
	}

	@Override
	public int hashCode() { 
		
		int ret = 31; 
		ret = ret * 13 + new Integer(this.qtdMax).hashCode();
		ret = ret * 13 + new Integer(this.qtdErr).hashCode();
		
		if (ret < 0) // transforma o ret em positivo se for negativo
			ret = -ret;

		return ret;
	}

	
	// construtor de cópia
	public ControladorDeErros(ControladorDeErros c) throws Exception {
		
		if (c == null)
			throw new Exception("");

		c.qtdMax = this.qtdMax;
		c.qtdErr = this.qtdErr;
	}
/*
	@Override
	public Object clone() {

		ControladorDeErros ret = this; // o lado esquerdo de uma atibuição deve ser uma variavel

		try {

			ret = new ControladorDeErros(ret);

		} catch (Exception erro) {

			System.err.println("");
		}

		return ret;
	}*/
}