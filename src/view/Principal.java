package view;

import controller.Arquivo;
import controller.ILerArquivo;

public class Principal {

	public static void main(String[] args) {
		
		String path = "C:\\Windows\\Temp";
		
		String arquivo = "generic_food.csv";
		 
		ILerArquivo Leitura = new Arquivo();
		
		try {
			Leitura.lerArquivo(path, arquivo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}