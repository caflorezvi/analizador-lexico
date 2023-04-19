# Analizador Léxico en Java

Este proyecto es un ejemplo de un analizador léxico hecho en Java. El objetivo de este programa es analizar el código fuente de un programa y separar las diferentes partes del lenguaje en tokens. 

## Requerimientos

- Java JDK 17 o superior
- IDE Java (como Eclipse o IntelliJ) o un editor de texto plano (como Visual Studio Code o Sublime Text)

## Uso

1. Clona este repositorio en tu máquina local:

   ```
   git clone https://github.com/caflorezvi/analizador-lexico.git
   ```

2. Abre el proyecto en tu IDE Java o editor de texto plano.

3. Completa las clases y los archivos que hagan falta

## Cómo funciona

Este programa utiliza autómatas finitos deterministas para separar el código fuente en tokens. 

El programa lee un código fuente caracter a caracter y busca coincidencias con las expresiones regulares definidas (o los autómatas finitos deterministas). Cada vez que se encuentra una coincidencia, se agrega un nuevo token a la lista de tokens.

## Licencia

Este proyecto está bajo la licencia GPL.