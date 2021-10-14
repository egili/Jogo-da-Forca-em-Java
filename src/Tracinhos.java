public class Tracinhos implements Cloneable
{
    private char texto[];

    public Tracinhos (int qtd) throws Exception{
    	
    	if (qtd < 0)
    		throw new Exception ("quantidade precisa ser positiva");
    	
    	this.texto = new char[qtd];
    	
    	 for(int i = 0; i < this.texto.length; i++)
        
             this.texto[i] = '_';
    }

    public void revele (int posicao, char letra) throws Exception
    {
           if(posicao < 0 || posicao >= this.texto.length)
        	   
               throw new Exception("posicao inválida");
           
           this.texto [posicao] = letra;
    }

    public boolean isAindaComTracinhos ()
    {
         for (int i = 0; i < this.texto.length; i++){
             if (this.texto [i] == '_'){
            	 
                 return true;
             }
         }
         return false;
    }

    @Override
    public String toString(){

    	String palavra = "";
    	
    	for(int i = 0; i < this.texto.length; i++) {
    		palavra += Character.toString(texto[i]) + " ";
    	}   
    	
    	return palavra;
    }

    @Override
    public boolean equals (Object obj){
    	
    	if(this == obj)
    		return true;
    	if(obj == null)
    		return false;
    	if(obj.getClass() != Tracinhos.class)
    		return false;
    	
    	Tracinhos tracinhos = (Tracinhos)obj;
    	
    	if(this.texto != tracinhos.texto)
    		return false;
    	
    	return true;
    }
    
    @Override
    public int hashCode ()
    {
        int ret = 31;
        ret = ret * 31 + new String(this.texto).hashCode(); // String é um vetor de caracteres
        
        if(ret < 0)
        	ret = -ret;
        
        return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception{ // construtor de cópia
    
    	if(t == null)
    		throw new Exception ("A instância não pode estar nula");
    	
    	t.texto = this.texto;    		
    }
/*
    public Object clone ()
    {
        /// retornar uma copia de this
    }
    */
}
