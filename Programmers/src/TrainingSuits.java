public class TrainingSuits {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		int answer = 0;
		
		// 체육복을 도난당한 학생
		boolean[] temp1 = new boolean[n];
		
		for(int i = 0 ; i < lost.length ; i++) {
			for(int j = 0 ; j < temp1.length ; j++) {
				if(j+1 == lost[i]) {
					temp1[j] = true;
				}
			}
		}
		for(int i = 0 ; i < temp1.length ; i++) {
			System.out.println(temp1[i]);
		}
		
		// 여분의 체육복을 갖고 있는 학생
		boolean[] temp2 = new boolean[n];
		
		for(int i = 0 ; i < reserve.length ; i++) {
			for(int j = 0 ; j < temp2.length ; j++) {
				if(j+1 == reserve[i]) {
					temp2[j] = true;
				}
			}
		}
		for(int i = 0 ; i < temp2.length ; i++) {
			System.out.println(temp2[i]);
		}
		
		
		for(int i = 0 ; i < n ; i++) {
			if(temp1[i]) {
				answer++;
			}
		}
				
		System.out.println(answer);

	}

}