package services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ItemProcess {
	
	List<String> lines = new ArrayList<>();

	public void processInFile(String path) {
		Locale.setDefault(Locale.US);
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				lines.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public void processOutFile(String path) {
		Locale.setDefault(Locale.US);
		path += "/out/";
		boolean fileCreated = new File(path).mkdir();
		if (fileCreated) {
			System.out.println("File created successfully!");
		}else {
			System.out.println("File already exist!");
		}
			
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "summary.csv"))) {
			for (String line : lines) {
				String[] field = line.split(",");
				Double value = Double.parseDouble(field[1]) * Double.parseDouble(field[2]);
				bw.write(field[0]+", " + String.format("%.2f", value));
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
