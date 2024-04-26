package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "/home/cpd/Documentos/GitHub/Java/Exercicio_Section18_Interface_Comparable_fixacao_01/src/people.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while( line != null) {
				list.add(line);
				line = br.readLine();
			}
			Collections.sort(list);
			for(String name:list) {
				System.out.println(name);
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
