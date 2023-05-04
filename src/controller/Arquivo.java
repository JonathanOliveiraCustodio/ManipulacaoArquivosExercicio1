package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arquivo implements ILerArquivo {

	@Override
	public void lerArquivo(String path, String name) throws IOException {
		File Arquivo = new File(path, name);
		if(Arquivo.exists() && Arquivo.isFile()) {
			FileInputStream fluxo = new FileInputStream(Arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			while(linha != null) {
				boolean cont = false;
				String[] lista = linha.split(",");
				for(String fruta : lista) {
					if(lista[2].contains("Fruits")) {
						cont = true;
						System.out.print(fruta+"\t");
					}
				}
				if(cont) {
					 System.out.println();
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {
			throw new IOException("Arquivo Inválido");
		}
	}
}
