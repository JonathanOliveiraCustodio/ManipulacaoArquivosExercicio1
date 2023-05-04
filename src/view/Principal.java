package view;

import controller.Arquivo;
import controller.ILerArquivo;

public class Principal {

	public static void main(String[] args) {
		
		String arquivo = "generic_food.csv";
		String path = "C:\\Windows\\Temp"; 
		
		ILerArquivo ler = new Arquivo();
		
		try {
			ler.lerArquivo(path, arquivo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}