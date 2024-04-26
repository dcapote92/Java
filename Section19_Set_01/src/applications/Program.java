package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		String path = "/home/cpd/Documentos/GitHub/Java/Section19_Set_01/src/access.log";

		Set<LogEntry> logs = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] field = line.split(" ");
				logs.add(new LogEntry(field[0], Date.from(Instant.parse(field[1]))));
				line = br.readLine();
			}
			System.out.println("File full path: " + path);
			System.out.printf("Total users: %d", logs.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
