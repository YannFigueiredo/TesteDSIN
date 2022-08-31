package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double desconto = 0.21;
		
		System.out.print("Informe a quantidade de horas diárias do funcionário: ");
		Integer qtdeHora = sc.nextInt();
		System.out.print("Informe o valor da hora trabalhada: ");
		Double valorHora = sc.nextDouble();
		System.out.print("Informe quantos dias foram trabalhados no mês: ");
		Integer diasTrabalhados = sc.nextInt();
		
		Double salarioBruto = qtdeHora * diasTrabalhados * valorHora; 
		
		System.out.println("\nO salário líquido do funcionário é R$ " + 
		String.format("%.2f", salarioBruto - (salarioBruto*desconto)));
		
		sc.close();
	}

}
