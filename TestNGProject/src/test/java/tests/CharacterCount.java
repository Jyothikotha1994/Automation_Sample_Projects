package tests;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "Kishan kumar sanapala";

        input = input.toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Output
        System.out.print("O/P: ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + "; ");
        }
        CharacterCount c= new CharacterCount();
        c.GetcountofCharacters("Kishan kumar sanapala");
    }
        public static void GetcountofCharacters(String name) {
        	//String name="Kishan kumar sanapala";
        	name.toLowerCase();
        	Map<Character,Integer> map= new LinkedHashMap<>();
        	for(char ch: name.toCharArray()) {
        		if(map.containsKey(ch)) {
        			map.put(ch,map.get(ch)+1);
        		}
        		else {
        			map.put(ch, 1);
        		}
        		
        	}
    	
    }
}
