import java.util.Arrays;

public class RemoveSmallestNumber {

	public static void main(String[] args) {
		int[] arr = {7, 2, 3, 4};
				
		// �迭�� ���Ұ� �ϳ��ۿ� ���� ���
		if(arr.length == 1) {
			
			int[] answer = {-1};
			
			System.out.println(Arrays.toString(answer));
			
		} else {
			
			int[] answer = new int[arr.length - 1];
			
			// �ּҰ� ã��
			int min = arr[0];
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(min > arr[i]) {
				min = arr[i];
				}
			}
			
			// �ּҰ��� ������ ������ ���ҵ��� answer�迭�� �Է� (���� X)
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