package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Candidate;
import services.VoteCounting;

public class Program {

	public static void main(String[] args) {
		String path = "/home/cpd/Documentos/GitHub/Java/Section19_Map_01/src/votes.csv";
		List<Candidate> list = new ArrayList<>();
		VoteCounting vc = new VoteCounting();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] field = line.split(",");
				list.add(new Candidate(field[0],Integer.parseInt(field[1].strip())));
				line = br.readLine();
			}
			System.out.println("File full path: " + path);
			for(String candidate: vc.processVotes(list).keySet()) {
				System.out.println(candidate + " : " + vc.processVotes(list).get(candidate));
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
