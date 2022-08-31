package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double desconto;
		
		System.out.print("Informe a descrição do item: ");
		String descricao = sc.nextLine();
		System.out.print("Informe a quantidade adquirida pelo cliente: ");
		Integer qtde = sc.nextInt();
		System.out.print("Informe o preço do item: ");
		Double preco = sc.nextDouble();
		
		Double total = qtde * preco;
		
		if(qtde <= 5) {
			desconto = 0.0555;
		}else if(qtde > 5 && qtde <= 10) {
			desconto = 0.08;
		}else{
			desconto = 0.125;
		}
		
		System.out.println("Total: R$ " + String.format("%.2f", total));
		System.out.println("Desconto: " + String.format("%.2f", desconto*100) + "%");
		System.out.println("Total a pagar: R$ " + String.format("%.2f", total - (total*desconto)));
		
		sc.close();
	}

}
