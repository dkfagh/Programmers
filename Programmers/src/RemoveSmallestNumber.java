import java.util.Arrays;

public class RemoveSmallestNumber {

	public static void main(String[] args) {
		int[] arr = {7, 2, 3, 4};
				
		// 배열의 원소가 하나밖에 없을 경우
		if(arr.length == 1) {
			
			int[] answer = {-1};
			
			System.out.println(Arrays.toString(answer));
			
		} else {
			
			int[] answer = new int[arr.length - 1];
			
			// 최소값 찾기
			int min = arr[0];
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(min > arr[i]) {
				min = arr[i];
				}
			}
			
			// 최소값을 제외한 나머지 원소들을 answer배열에 입력 (정렬 X)
			int i, j;
			for(i = j = 0 ; i < arr.length ; i++) {
				if(arr[i] == min) {
					continue;
				} else {
					answer[j] = arr[i];
					j++;
				}
				
			}

			System.out.println(Arrays.toString(answer));

		}
		
	}
}