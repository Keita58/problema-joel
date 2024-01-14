package JUnit;

import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		int f = ohowo.nextInt();
		int[][] matriu = new int[f][f];
		
		for(int i = 0; i < f; i++) {
			for(int j = 0; j < f; j++) {
				matriu[i][j] = ohowo.nextInt();
			}
		}
		
		int[] res = posicio(matriu);
		
	}

	public static int[] posicio(int[][] matriu) {
		// TODO Auto-generated method stub
		return null;
	}
}
