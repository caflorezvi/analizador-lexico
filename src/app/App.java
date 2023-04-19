package app;

import modelo.AnalizadorLexico;

/**
 * Clase principal del proyecto
 * @date Abril de 2023
 * @author Carlos Andrés Flórez
 */
public class App {
    public static void main(String[] args) {
        
        AnalizadorLexico an = new AnalizadorLexico("892892asas");
        an.analizar();
        an.getListaTokens().forEach(System.out::println);
    }
}
