import java.util.Arrays;

public class budgets {

	public static void main(String[] args) {
		int[] d = {2, 2, 3, 3};
		int budget = 10;
		
		int answer = 0;

		Arrays.sort(d);
		
		for(int i = 0 ; i < d.length ; i++) {
			if(budget >= d[i]) {
				answer++;
				budget = budget - d[i];
			} else {
				break;
			}
		}
		
		System.out.println(answer);
	}
}