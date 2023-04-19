package modelo;

/**
 * Clase que representa la estructura más pequeña de información de un analizador léxico (token)
 * @date Abril de 2023
 * @author Carlos Andrés Flórez
 */
public record Token( String palabra, Categoria categoria, int indiceSgte ){}