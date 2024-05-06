package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M, N;
		System.out.print("M: ");
		M = sc.nextInt();
		System.out.print("N: ");
		N = sc.nextInt();
		int[][] matriz = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.print("Digite um número que pertence à matriz: ");
		int aux = sc.nextInt();
		sc.close();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matriz[i][j] == aux) {
					System.out.printf("Posição %d,%d:%n", i, j);
					if (j >0)
						System.out.printf("Left: %d%n", matriz[i][j-1]);
					if (i>0) 
						System.out.printf("Up: %d%n", matriz[i-1][j]);
					if (j < N-1)
						System.out.printf("Right: %d%n", matriz[i][j+1]);
					if (i < M-1)
						System.out.printf("Down: %d%n", matriz[i+1][j]);
						
						
					
					
				}
			}
		}

	}
}
