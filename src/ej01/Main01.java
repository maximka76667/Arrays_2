package ej01;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Filas: ");
		int filas = entrada.nextInt();
		
		System.out.print("Columnas: ");
		int columnas = entrada.nextInt();
		
		int matriz[][] = new int[filas][columnas];
		
		for(int i = 0; i < filas; i++) for(int j = 0; j < columnas; j++) matriz[i][j] = i + j;
		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) System.out.print(matriz[i][j] + " ");
			System.out.println();
		}
		
		entrada.close();
	}
}
