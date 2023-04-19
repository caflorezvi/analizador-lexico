package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal del Analizador léxico del compilador.
 * @date Abril de 2023
 * @author Carlos Andrés Flórez
 */
public class AnalizadorLexico {
    
    private String codigoFuente;
    private List<Token> listaTokens;

    /**
     * Constructor de la clase principal.
     * @param codigoFuente - código al cual se le van a extraer los tokens.
     */
    public AnalizadorLexico(String codigoFuente){
        this.codigoFuente = codigoFuente;
        this.listaTokens = new ArrayList<>();
    }

    /**
     * Extrae los tokens de un código fuente dado.
     */
    public void analizar(){

	    // El primer token se extrae a partir de posición cero
    	int i = 0;

        //TODO Ciclo para extraer todos los tokens y los vaya guardando en la lista de tokens

    }

    /**
     * Extrae el token de la cadena cod a partir de la posición i, basándose en el Autómata.
     * @param indice - posición a partir de la cual se va a extraer el token.
     * @return token que se extrajo de la cadena.
     */
    public Token extraerSgteToken(int indice){
        
        Token token = null;

		// Intenta extraer un entero
        token = extraerEntero(indice);
        if(token != null)
            return token;        

        //TODO llamar acá todos los métodos de extraer, extraerDecimal, extraerIdentificador, etc.

		// Extrae un token no reconocido
		token = extraerNoReconocido(indice);

        return token;
    }

    /**
     * Intenta extraer un entero de la cadena cod a partir de la posición indice, basándose en el Autómata.
     * @param indice - posición a partir de la cual se va a intentar extraer un entero.
     * @return el token con la categoría ENTERO o null si el token en la posición dada no es un entero.
     */
    public Token extraerEntero(int indice){

        if( Character.isDigit(codigoFuente.charAt(indice)) ){

            int posicion = indice;

            while( indice < codigoFuente.length() && Character.isDigit(codigoFuente.charAt(indice)) ){
                indice++;
            }

            return new Token(codigoFuente.substring(posicion, indice), Categoria.ENTERO, indice);

        }

        return null;
    }


    /**
     * Extraer un símbolo no reconocido del código fuente a partir de la posición indice.
     * Antes de utilizar este método, debe haberse intentado todos los otros métodos para los otros tipos de token.
     * @param indice - posición a partir de la cual se va a extraer el token no reconocido.
     * @return el token no reconocido.
     */
	public Token extraerNoReconocido (int indice){
		String lexema =  codigoFuente.substring( indice, indice + 1);
		return new Token( lexema, Categoria.NO_RECONOCIDO, indice+1 );	
	}

    /**
     * Obtiene la lista de todos los tokens reconocidos por el analizador léxico
     * @return lista de tokens
     */
    public List<Token> getListaTokens(){
        return listaTokens;
    }

}
