package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe 4 valores inteiros: ");
		Integer A = sc.nextInt();
		Integer B = sc.nextInt();
		Integer C = sc.nextInt();
		Integer D = sc.nextInt();
		
		if(B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores não aceitos");
		}
	}

}
