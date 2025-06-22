package gestion;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		JuegoAdivinar JuegoAdivinar;
		//Menú de opciones
		do {
			
			System.out.println("Adivina el Número");
			
			System.out.println("1. Facil (5 intentos): Debes adivinar un número entre el 1 y el 20");

			System.out.println("2. Medio (3 intentos): Debes adivinar un número entre el 1 y el 50");
			
			System.out.println("3. Dificil (2 intentos): Debes adivinar un número entre el 1 y el 100");

			System.out.println("4. Salir del juego");
				
			System.out.println("Seleccione una opcion: ");
			
			opcion = ObtenerInt();
			// Llamamos la clase Random de java para poder generar un numero aleatorio.
			Random random = new Random();
			// Llamamos la clase JuegoAdivinar
			JuegoAdivinar = new JuegoAdivinar();

			switch(opcion) {
			
			case 1: 
				// Cambiamos el maximo de intentos a 5
				JuegoAdivinar.setMaxIntentos(5);
				// Iniciamos el valor de intentos para comenzar
				JuegoAdivinar.setIntentosRealizados(1);
				// Creamos un numero magico desde el 1 al 20
				JuegoAdivinar.setNumeroMagico(random.nextInt(20) + 1);
				System.out.println("Debes adivinar un número entre el 1 y el 20");
				// Comenzamos el juego pasandole el maximo permitido
				JuegoAdivinar.Comenzar(20);
			break;

			case 2: 
				// Cambiamos el maximo de intentos a 3
				JuegoAdivinar.setMaxIntentos(3);
				// Iniciamos el valor de intentos para comenzar
				JuegoAdivinar.setIntentosRealizados(1);
				// Creamos un numero magico desde el 1 al 50
				JuegoAdivinar.setNumeroMagico(random.nextInt(50) + 1);
				System.out.println("Debes adivinar un número entre el 1 y el 50");
				// Comenzamos el juego pasandole el maximo permitido
				JuegoAdivinar.Comenzar(50);
				break;
				
			case 3:
				// Cambiamos el maximo de intentos a 2
				JuegoAdivinar.setMaxIntentos(2);
				// Iniciamos el valor de intentos para comenzar
				JuegoAdivinar.setIntentosRealizados(1);
				// Creamos un numero magico desde el 1 al 100
				JuegoAdivinar.setNumeroMagico(random.nextInt(100) + 1);
				System.out.println("Debes adivinar un número entre el 1 y el 100");
				// Comenzamos el juego pasandole el maximo permitido
				JuegoAdivinar.Comenzar(100);
				break;
				
			case 4: 
				System.out.print("Saliendo del juego.");
				break;
				
				default:
					System.out.print("La opcion elegida no es valida");
			}

		} while(opcion != 4);
		
	}


	private static int ObtenerInt() {
		
		int i = 0;
		
		while(i==0) {
			try {
				int nro = scn.nextInt();
				i=nro;
				
			}
			catch(InputMismatchException e) {
				System.out.println("Por favor ingresar un valor numerico");
				
				scn.next();
				
				System.out.print("Ingrese valor ");
			}
		}
		
		return i;
	}


}

