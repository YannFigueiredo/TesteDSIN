package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Integer tamanhoEspaco = 60;
		String ladoEsqSup = "||";
		String ladoDirSup = "||";
		String ladoEsqInf = "||";
		String ladoDirInf = "||";
		String aux = "";
		String tituloSup = "DSIN";
		String tituloInf = "TECNOLOGIA DA INFORMAÇÃO";

		 for(int i = 0; i < ((tamanhoEspaco - tituloSup.length())/2) - 2; i++) {
			 ladoEsqSup += " ";
			 aux += " ";
		 }
		 
		 ladoDirSup = aux + ladoDirSup;
		 
		 aux= "";
		 
		 for(int i = 0; i < ((tamanhoEspaco - tituloInf.length())/2) - 2; i++) {
			 ladoEsqInf += " ";
			 aux += " ";
		 }
		 
		 ladoDirInf = aux + ladoDirInf;
		
		System.out.print("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		System.out.print(ladoEsqSup + tituloSup + ladoDirSup + "\n");
		System.out.print(ladoEsqInf + tituloInf + ladoDirInf + "\n");
		System.out.print("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
	}

}
