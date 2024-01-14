package JUnit;

import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		int f = ohowo.nextInt();
		int[][] matriu = new int[f][];
		
		for(int i = 0; i < f; i++) {
			for(int j = 0; j < f; j++) {
				matriu[i][j] = ohowo.nextInt();
			}
		}
		
		int[][] res = posicio(matriu);
		
	}

	public static int[][] posicio(int[][] matriu) {
		
		if(matriu[0][0] > matriu[0][matriu.length - 1] && matriu[0][0] > matriu[matriu.length - 1][0] && matriu[0][0] > matriu[matriu.length - 1][matriu.length - 1]) {
			int[][] solucio = {{0,0}, {matriu.length - 2, matriu.length - 2}};
			return solucio;
		}
		else if(matriu[0][0] < matriu[0][matriu.length - 1] && matriu[0][matriu.length - 1] > matriu[matriu.length - 1][0] && matriu[0][matriu.length - 1] > matriu[matriu.length - 1][matriu.length - 1]) {
			int[][] solucio = {{0,1}, {matriu.length - 2, matriu.length - 1}};
			return solucio;
		}
		else if(matriu[matriu.length - 1][0] > matriu[0][0] && matriu[matriu.length - 1][0] > matriu[0][matriu.length - 1] && matriu[matriu.length - 1][0] > matriu[matriu.length - 1][matriu.length - 1]) {
			int[][] solucio = {{1,0}, {matriu.length - 1, matriu.length - 2}};
			return solucio;
		}
		else if(matriu[matriu.length - 1][matriu.length - 1] > matriu[0][0] && matriu[matriu.length - 1][matriu.length - 1] > matriu[0][matriu.length - 1] && matriu[matriu.length - 1][0] < matriu[matriu.length - 1][matriu.length - 1]) {
			int[][] solucio = {{1,1}, {matriu.length - 1, matriu.length - 1}};
			return solucio;
		}
		// En aquests primers if else mirem si les quatre coordenades son diferents, si no ho son passem a l'else
		else {
			if(matriu[0][0] == matriu[0][matriu.length - 1]) {
				int[][] solucio = {{0,0}, {matriu.length - 2, matriu.length - 2}};
				return solucio;
			}
			else if(matriu[0][0] == matriu[matriu.length - 1][0]) {
				int[][] solucio = {{0,0}, {matriu.length - 2, matriu.length - 2}};
				return solucio;
			}
			else if(matriu[0][0] == matriu[matriu.length - 1][matriu.length - 1]) {
				int[][] solucio = {{0,0}, {matriu.length - 2, matriu.length - 2}};
				return solucio;
			}
			else if(matriu[0][matriu.length - 1] == matriu[matriu.length - 1][0]) {
				int[][] solucio = {{0,1}, {matriu.length - 2, matriu.length - 1}};
				return solucio;
			}
			else if(matriu[0][matriu.length - 1] == matriu[matriu.length - 1][matriu.length - 1]) {
				int[][] solucio = {{0,1}, {matriu.length - 2, matriu.length - 1}};
				return solucio;
			}
			else if(matriu[matriu.length - 1][0] == matriu[matriu.length - 1][matriu.length - 1]) {
				int[][] solucio = {{1,0}, {matriu.length - 1, matriu.length - 2}};
				return solucio;
			}
			// En aquests if else mirem si hi ha cap coordenada igual, només 1 a 1
			else {
				
			}
		}
	}
}
