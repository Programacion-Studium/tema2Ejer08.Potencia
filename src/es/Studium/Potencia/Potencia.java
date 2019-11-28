package es.Studium.Potencia;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, exponente, resultado, i; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca la base");
		base = teclado.nextInt();
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el exponente");
		exponente = teclado.nextInt();
		teclado.close();
		resultado=1;
		for(i=1; i<=exponente;i++) 
		{
			resultado=resultado*base;
		}
		System.out.println("El resultado es: "+resultado);
	}

}
