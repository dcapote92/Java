package applications;

import services.ItemProcess;

public class Programs {

	public static void main(String[] args) {
		ItemProcess ip = new ItemProcess();
		String path = "/home/cpd/Documentos/GitHub/Java/Exercicio_Section17_Files_fixacao_01/src/" ;
		ip.processInFile(path+"items.csv");
		ip.processOutFile(path);
	}

}
