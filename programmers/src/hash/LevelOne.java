package hash;

import java.util.HashMap;
import java.util.Map;

public class LevelOne {
	String answer = "";
	 Map<String, Integer> participantMap = new HashMap<String, Integer>();
	 Map<String, Integer> completionMap = new HashMap<String, Integer>();

	public String solution(String[] participant, String[] completion) {
		for (int i = 0; i < participant.length; i++) {
		 
			 String key = participant[i];
			 
			 if(participantMap.containsKey(key)) {
				 int cnt = participantMap.get(key);
				 cnt++;
				 participantMap.put(key, cnt);
			 } else {
				 participantMap.put(key, 1);
			 }
		}
		 
		 
		for (int i = 0; i < completion.length; i++) {
			 String key = completion[i];
			 if(completionMap.containsKey(key)) {
				 int cnt = completionMap.get(key);
				 cnt++;
				 completionMap.put(key, cnt);
			 } else {
				 completionMap.put(key, 1);
			 }
		}
		 
		 for(String name : participantMap.keySet()) {
			 if(participantMap.get(name) != completionMap.get(name)) {
				 return name;
			 }
		 }
		 return answer;
	}
}
