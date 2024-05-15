package strings_Ex;

import java.util.HashMap;
import java.util.Map;

public class String_aabbccdefaa {

	public static void main(String[] args) {
		String s1 = "aabbccdefaa";
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (char c : s1.toCharArray()) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}


		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
