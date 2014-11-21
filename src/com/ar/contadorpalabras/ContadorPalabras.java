package com.ar.contadorpalabras;

public class ContadorPalabras {

	/**
	 * @file ContadorDePalabras.java
	 * @version 1.1
	 * @author Linea de Codigo (http://lineadecodigo.com)
	 * @date   19-agosto-2007
	 * @url    http://lineadecodigo.com/2007/08/19/contador-de-ocurrencias-en-java/
	 * @description Contar cuantas veces se repite palabra dentro de una cadena.  
	 */
	
	public static void main(String[] args) {
		// Texto
	    String sTexto = "palabra o palabra y palabra";
	    // Texto que vamos a buscar
	    String sTextoBuscado = "palabra";
	    // Contador de ocurrencias 
	    int contador = 0;

	    while (sTexto.indexOf(sTextoBuscado) > -1) {
	      sTexto = sTexto.substring(sTexto.indexOf(
	        sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
	      contador++; 
	    }

	    System.out.println (contador);

	}

}
