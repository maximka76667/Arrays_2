package ej01;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Filas: ");
		int filas = entrada.nextInt();
		
		System.out.print("Columnas: ");
		int columnas = entrada.nextInt();
		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) System.out.print(i + j);
			System.out.println();
		}
		
		entrada.close();
	}

}
