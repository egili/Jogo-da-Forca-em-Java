public class TesteControladorDeLetrasJaDigitadas {

    public static void main (String[] args)
    {
        try
        {
            System.out.println("teste 1: funcionamento do construtor ");
            ControladorDeLetrasJaDigitadas p1 = new ControladorDeLetrasJaDigitadas ();
            System.out.println (p1.getClass() + ": contrutor funcionando \n");

        }
        catch (Exception erro)
        {
            System.err.println ("construtor não funcionando \n");
        }
        
        
       try
        {
            System.out.println("teste 2: objeto possui letras digitadas sem ser registrada");
            ControladorDeLetrasJaDigitadas p2 = new ControladorDeLetrasJaDigitadas ();
          System.out.println("letra já registrada? " + p2.isJaDigitada('a')+ "\n");
        }
        catch (Exception erro)
        {
            System.err.println ("foi encontrda uma letra registrada \n");
        }
       
        
        try
        {
            System.out.println("teste 3: possui uma letra já fornecida ");
            ControladorDeLetrasJaDigitadas p3 = new ControladorDeLetrasJaDigitadas ();
            p3.registre('j');
            p3.registre('a');
            System.out.println("letras encontradas: " + p3.toString() + "\n");
        }
        catch (Exception erro)
        {
            System.err.println ("letra não encontrada \n");
        }
        
        
        try
        {
            System.out.println("teste 4: testando registro sem letras repetidas ");
            ControladorDeLetrasJaDigitadas p3 = new ControladorDeLetrasJaDigitadas();
            p3.registre('p');
            p3.registre('a');
            p3.registre('r');
          //  p3.registre('a');
            p3.registre('l');
            p3.registre('e');
           // p3.registre('l');
           // p3.registre('p');
            p3.registre('i');
           // p3.registre('p');
           // p3.registre('e');
            p3.registre('d');
            p3.registre('o');

            System.out.println("letras encontradas: " + p3.toString() + "\n");
        }
        catch (Exception erro)
        {
            System.err.println ("letra não encontrada \n");
        }
        
        
        try
        {
            System.out.println("teste 5: testando registro com letras repetidas ");
            ControladorDeLetrasJaDigitadas p4 = new ControladorDeLetrasJaDigitadas();
            p4.registre('p');
            p4.registre('a');
            p4.registre('r');
            p4.registre('a');
            p4.registre('l');
            p4.registre('e');
            p4.registre('l');
            p4.registre('p');
            p4.registre('i');
            p4.registre('p');
            p4.registre('e');
            p4.registre('d');
            p4.registre('o');

            System.out.println("letras encontradas: " + p4.toString() + "\n");
        }
        catch (Exception erro)
        {
            System.err.println ("imposível passar letras repetidas como paramêtro \n");
        }
        
        
        try
        {
            System.out.println("teste 6: testando registro com char numérico");
            ControladorDeLetrasJaDigitadas p5 = new ControladorDeLetrasJaDigitadas ();
            p5.registre('5');

            System.out.println("char encontrado? " + p5.toString() + "\n");
        }
        catch (Exception erro)
        {
            System.err.println ("um char não pode ser passado como paramêtro para o construtor \n");
        }
        
        
        try
        {
            System.out.println("Teste 7: funcionamento dos métodos construtor de copia e equals ");
            ControladorDeLetrasJaDigitadas p6 = new ControladorDeLetrasJaDigitadas();
            ControladorDeLetrasJaDigitadas p6Copia = new ControladorDeLetrasJaDigitadas(p6);
            System.out.println("foi contruida uma cópia igual ao primeiro objeto? " + p6.equals(p6Copia) + "\n");

        }
        catch (Exception erro)
        {
            System.err.println("não foi possível construir uma cópia e compara-la com a primeira instância \n");
        }

    }
}