import java.util.ArrayList;

public class Exam {

	public static void main(String[] args) {		
		int[] answers = {3, 3, 1};
		
		int[] s1 = {1, 2, 3, 4, 5};
		int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		Integer[] scores = {0, 0, 0};
		
		for(int i = 0 ; i < answers.length ; i++) {
			
			if(answers[i] == s1[i%s1.length]) {
				scores[0]++;
			}
			if(answers[i] == s2[i%s2.length]) {
				scores[1]++;
			}
			if(answers[i] == s3[i%s3.length]) {
				scores[2]++;
			}
		}
		
		int max = 0;

		for(int i = 0 ; i < scores.length ; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		
		ArrayList<Integer> winner = new ArrayList<>();
		
		if(scores[0] == max) {
			winner.add(1);
		}
		if(scores[1] == max) {
			winner.add(2);
		}
		if(scores[2] == max) {
			winner.add(3);
		}
		
		int[] answer = new int[winner.size()];
		
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = winner.get(i);
			System.out.println(answer[i]);
		}
		
	}
}