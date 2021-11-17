package ej10;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Filas: ");
		int filas = entrada.nextInt();
		System.out.print("Cols: ");
		int cols = entrada.nextInt();
		
		entrada.close();
		
		int[][] a = new int[filas][cols], 
				b = new int[filas][cols], 
				c = new int[filas][cols];
		
		// Generacion de matrizes A y B
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < cols; j++) {
				a[i][j] = (int) Math.floor(Math.random() * 10);
				b[i][j] = (int) Math.floor(Math.random() * 10);
			}
		}
		
		// Escribir A
		System.out.println("\nA");
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < cols; j++) System.out.print(a[i][j] + " ");
			System.out.println();
		}
		
		// Escribir B
		System.out.println("\nB");
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < cols; j++) System.out.print(b[i][j] + " ");
			System.out.println();
		}
		
		// Calcular y escribir C
		System.out.println("\nC");
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < cols; j++) {
				int suma = 0;
				for (int r = 0; r < filas; r++) suma += a[i][r] * b[r][j];
				c[i][j] = suma;
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
