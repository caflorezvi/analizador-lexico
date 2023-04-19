package modelo;

/**
 * Lista de las categorías léxicas que reconoce el compilador
 * @date Abril de 2023
 * @author Carlos Andrés Flórez
 */
public enum Categoria {
    NO_RECONOCIDO,
    ENTERO,
    DECIMAL,
    IDENTIFICADOR,
    PALABRA_RESERVADA,
    CADENA_CARACTERES,
    COMENTARIO_LINEA,
    COMENTARIO_BLOQUE,
    OPERADOR_ARITMETICO,
    OPERADOR_RELACIONAL,
    OPERADOR_LOGICO,
    OPERADOR_INCREMENTO
    
    //TODO Completar la lista con las categorías léxicas faltantes

}
