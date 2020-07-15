import java.util.ArrayList;
import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		String[] answer = new String[strings.length];
		
		String[] idx = new String[strings.length];

		for(int i = 0 ; i < strings.length ; i++) {
			idx[i] = strings[i].substring(n, n+1);
		}
		
		Arrays.sort(idx);
		Arrays.sort(strings);
		
		ArrayList<String> newStrings = new ArrayList<>();
		for(String item : strings) {
			newStrings.add(item);
		}
		
		for(int i = 0 ; i < answer.length ; i++) {
			for(int j = 0 ; j < newStrings.size() ; j++) {
				if(idx[i].equals(newStrings.get(j).substring(n, n+1))) {
					answer[i] = newStrings.get(j);
					newStrings.remove(j);
					break;
				} 
			}
		}
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.println(answer[i]);
		}
	}
}