package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<>();
		String path = "/home/cpd/Documentos/GitHub/Java/Exercicio_Section18_Interface_Comparable_fixacao_02/src/employee.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while( line != null) {
				String[] field = line.split(",");
				list.add(new Employee(field[0],Double.parseDouble(field[1])));
				line = br.readLine();
			}
			Collections.sort(list);
			for ( Employee emp : list) {
				System.out.printf("%s - %.2f%n",emp.getName(), emp.getWage());
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
