package collectionslevel1;
import java.util.HashMap;
public class CharacterCount {
	public static void main(String[]args) {
		String text="Write Java code to define yet another Set s. Insert 3 floating point numbers in s, and using an iterator, find the sum of the numbers in s.";
		text=text.toLowerCase();
		HashMap<Character, Integer> map=new HashMap<>();
		//Count Characters
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			if(ch=='a'||ch=='c'||ch=='o'||ch=='s') {
				if(map.containsKey(ch)) {
					map.put(ch,map.get(ch)+1);
				}
				else {
					map.put(ch, 1);
				}
			}
		}
		//print result
		System.out.println("Character counts:");
        System.out.println("a: " + map.getOrDefault('a', 0));
        System.out.println("c: " + map.getOrDefault('c', 0));
        System.out.println("s: " + map.getOrDefault('s', 0));
        System.out.println("o: " + map.getOrDefault('o', 0));
		
	}

}
