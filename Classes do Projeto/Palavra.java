
public class Palavra implements Comparable<Palavra> {

    private String texto;

    public Palavra (String texto) throws Exception
    {
        if(texto == null)
            throw new Exception ("Palavra não pode estar nula");

        this.texto = texto;
    }

    public int getQuantidade(char letra) {

        int quantidadeDeLetras = 0;

        for(int i = 0; i < this.texto.length(); i++) {
          if(this.texto.charAt(i)==(letra))
            quantidadeDeLetras ++;
        }

        return quantidadeDeLetras ;
      }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        int quantidadeDeOcorrencias = 0;

        for(int x = 0; x < this.texto.length(); x++){
            if(this.texto.charAt(x) == letra) {
                if(quantidadeDeOcorrencias == i) {
                    return x;
                }
                quantidadeDeOcorrencias ++;
            }
        }
        throw new Exception ("Não foi encontrada a " + (i + 1) + "ª posição da letra fornecida!");
    }

    public int getTamanho() {
        return this.texto.length();
    }

    @Override
    public String toString() {
        return this.texto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Palavra) || obj.getClass() != Palavra.class)
            return false;

        Palavra outra = (Palavra) obj;
        return this.texto.equals(outra.texto);
       }

    @Override
    public int hashCode() {
        return this.texto != null ? this.texto.hashCode() : 0;
    }

    @Override
    public int compareTo(Palavra palavra) {
        return this.texto.compareTo(palavra.texto);
    }
}
