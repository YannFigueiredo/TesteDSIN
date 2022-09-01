package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double X = null;
		
		System.out.print("Informe 3 valores inteiros: ");
		Integer A = sc.nextInt();
		Integer B = sc.nextInt();
		Integer C = sc.nextInt();
		
		if(A == 0 && B == 0 && C != 1) {
			System.out.println("Solução impossível");
		}else {
			X = (double) (1 - C)/(A + B);
		}
		
		System.out.println("O resultado da equação é " + String.format("%.3f", X));
		
		sc.close();
	}

}
