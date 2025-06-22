package gestion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoAdivinar {

	static Scanner scn = new Scanner(System.in);
	private int intentos;
	private int numeroMagico;
	private int intentosRealizados;
	private int maxIntentos;

	/**
	 * @param intentos
	 * @param numeroMagico
	 * @param intentosRealizados
	 */
	public JuegoAdivinar() {
		super();
	}

	/**
	 * @return the intentos
	 */
	public int getIntentos() {
		return intentos;
	}

	/**
	 * @param intentos the intentos to set
	 */
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	/**
	 * @return the numeroMagico
	 */
	public int getNumeroMagico() {
		return numeroMagico;
	}

	/**
	 * @param numeroMagico the numeroMagico to set
	 */
	public void setNumeroMagico(int numeroMagico) {
		this.numeroMagico = numeroMagico;
	}

	/**
	 * @return the intentosRealizados
	 */
	public int getIntentosRealizados() {
		return intentosRealizados;
	}

	/**
	 * @param intentosRealizados the intentosRealizados to set
	 */
	public void setIntentosRealizados(int intentosRealizados) {
		this.intentosRealizados = intentosRealizados;
	}

	/**
	 * @return the intentos
	 */
	public int getMaxIntentos() {
		return maxIntentos;
	}

	/**
	 * @param intentos the intentos to set
	 */
	public void setMaxIntentos(int maxIntentos) {
		this.maxIntentos = maxIntentos;
	}

	public void Comenzar(int maxNumero) {
		while (this.intentosRealizados <= this.maxIntentos) {
			System.out.println("Intento " + (this.intentosRealizados));
			System.out.println("Ingrese un numero: ");
			this.intentos = validarNumero(maxNumero);
			
			if (this.intentos == this.numeroMagico) {
				System.out.println("¡Adivinaste el numero! ");
				scn.nextLine();
				System.out.println("Si queres seguir jugando toca la opcion!");
				return;
			} 
			
			if (this.intentos < this.numeroMagico && this.intentosRealizados != this.maxIntentos) {
				System.out.println("El Número es Mayor. ");
			} 
			if (this.intentos > this.numeroMagico && this.intentosRealizados != this.maxIntentos) {
				System.out.println("El Número es Menor. ");
			}
			this.intentosRealizados++;
		}
		
		System.out.println("¡Perdiste! El numero magico era: " + this.numeroMagico);
		scn.nextLine();
		System.out.println("Si queres seguir jugando toca la opcion!");
	}
	
	private static int validarNumero(int maxNumero) {
		
		int i = 0;
		
		while(i==0) {
			try {
				int nro = scn.nextInt();
				if (nro <= maxNumero) {
					i=nro;
				} else {
					throw new InputMismatchException("Numero no permitido!");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Por favor ingresar un numero entre el 1 y el " + maxNumero);
				System.out.print("Ingrese un numero: ");
			}
		}
		
		return i;
	}
}
