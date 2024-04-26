package services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Candidate;

public class VoteCounting {
	
	public Map<String, Integer> processVotes(List<Candidate> candidates) {
		Map<String, Integer> map = new HashMap<>();
		for (Candidate cand : candidates) {
			if (!map.containsKey(cand.getName())) {
				map.put(cand.getName(), cand.getVotes());
			}else {
				map.put(cand.getName(), (int)(map.get(cand.getName())+ cand.getVotes()));
			}
		}
		return map;
	}
}
