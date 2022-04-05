
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
        int[] qualALetra = new int[10];
        char[] ocorrencia = new char[50];
        int quantidadeDeOcorrencias = 0;

		for(int x = 0; x < this.texto.length(); x++){
			
            ocorrencia[x] = this.texto.charAt(x);
            
            if(ocorrencia[x] == (letra)) {
            	
                qualALetra[quantidadeDeOcorrencias] = x;
                quantidadeDeOcorrencias ++;
            }
        }
        if(quantidadeDeOcorrencias  == 0)
            throw new Exception ("Não foi encontrado a iezima posicao da letra fornecida!");
        
        return qualALetra[i];
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

        if (obj == null) 
            return false;

        if (!(obj instanceof Palavra)) 
            return false;
        
        if (obj.getClass() != Palavra.class) 
            return false;
        
        if (this.texto != ((Palavra) obj).texto) 
            return false;
        
        return true;
       }

    @Override
    public int hashCode() {
    	
        int ret = 31;
        
        ret = ret * 13 + new String(this.texto).hashCode();

        return ret < 0 ? -ret : ret;     
    } 

    @Override
    public int compareTo(Palavra palavra) {
    	
        return this.texto.compareTo(palavra.texto);
    }
}
