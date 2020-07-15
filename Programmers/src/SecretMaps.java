import java.util.Arrays;

public class SecretMaps {

	public static void main(String[] args) {
		int n = 5;
		
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		String[] answer = new String[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			String temp1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]));
			String temp2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]));
			
			System.out.println(temp1);
			System.out.println(temp2);
			System.out.println();
			
			answer[i] = "";
			
			for(int j = 0 ; j < n ; j++) {
								
				// temp1의 j번째 값 또는 temp2의 j번째 값이 1이거나 두 값 모두 1일 경우
				if(temp1.charAt(j)=='1' && temp2.charAt(j)=='1' || temp1.charAt(j)=='1' || temp2.charAt(j)=='1') {
					answer[i] += "#";
				// temp1의 j번째 값과 temp2의 j번째 값이 다르거나 두 값 모두 0일 경우
				} else {
					answer[i] += " ";
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}