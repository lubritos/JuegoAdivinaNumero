package gestion;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		JuegoAdivinar JuegoAdivinar;
		
		do {
			
			System.out.println("Adivina el Número");
			
			System.out.println("1. Facil (5 intentos): Debes adivinar un número entre el 1 y el 20");

			System.out.println("2. Medio (3 intentos): Debes adivinar un número entre el 1 y el 50");
			
			System.out.println("3. Dificil (2 intentos): Debes adivinar un número entre el 1 y el 100");

			System.out.println("4. Salir del juego");
			
			
			System.out.println("Seleccione una opcion: ");
			
			opcion = ObtenerInt();
			Random random = new Random();
			JuegoAdivinar = new JuegoAdivinar();

			switch(opcion) {
			
			case 1: 
				JuegoAdivinar.setMaxIntentos(5);
				JuegoAdivinar.setIntentosRealizados(1);
				JuegoAdivinar.setNumeroMagico(random.nextInt(20) + 1);
				System.out.println("Debes adivinar un número entre el 1 y el 20");
				JuegoAdivinar.Comenzar(20);
			break;

			case 2: 
				JuegoAdivinar.setMaxIntentos(3);
				JuegoAdivinar.setIntentosRealizados(1);
				JuegoAdivinar.setNumeroMagico(random.nextInt(50) + 1);
				System.out.println("Debes adivinar un número entre el 1 y el 50");
				JuegoAdivinar.Comenzar(50);
				break;
				
			case 3:
				JuegoAdivinar.setMaxIntentos(2);
				JuegoAdivinar.setIntentosRealizados(1);
				JuegoAdivinar.setNumeroMagico(random.nextInt(100) + 1);
				System.out.println("Debes adivinar un número entre el 1 y el 100");
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

