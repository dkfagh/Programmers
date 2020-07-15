import java.util.Arrays;
import java.util.Collections;

public class FailureRate {

	public static void main(String[] args) {
		// 스테이지 갯수
		int N = 5;
		
		// 사용자가 멈춰있는 스테이지 번호
		int[] stages = {2,1,2,6,2,4,3,3};
		// 첫 스테이지부터 도전하는 사용자의 수
		int attempt = stages.length;
		
		// 실패율 실수값을 저장할 Float형 임시 배열
		Float[] temp = new Float[N];
		
		int[] answer = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			
			// 해당 스테이지에서 멈춰있는 사용자의 수
			int count = 0;
			
			for(int item : stages) {
				
				if(item == i+1) {
					count++;
				}
			}
			
			System.out.println("스테이지" + (i+1) + "에서 멈춰있는 사용자 수 : " + count);
			System.out.println("스테이지" + (i+1) + "에 도전한 사용자 수  : " + attempt);
						
			if(attempt != 0) {
				temp[i] = (float)count/attempt;
			// 해당 스테이지에 도전한 사용자가 없을 경우
			} else {
				temp[i] = (float)0;
			}
			
			attempt -= count;
			System.out.println("스테이지" + (i+1) + "를 완료한 사용자 수 : " + attempt);
			System.out.println("스테이지" + (i+1) + "의 실패율 : " + temp[i]);
			System.out.println();
		}
		
		// temp배열을 복사
		Float[] temp2 = temp.clone();
		System.out.println("내림차순으로 정렬하지 않은 실패율 배열 : " + Arrays.toString(temp2));
		
		// 스태이지별 실패율이 담긴 temp배열을 내림차순으로 정렬
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println("내림차순으로 정렬한 실패율 배열 : " + Arrays.toString(temp));
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.println(temp[i]);
			System.out.println(Arrays.asList(temp2).indexOf(temp[i]) + 1);
			
			// 실패율을 내림차순으로 정렬한 temp배열의 값을 하나씩 뽑아서 정렬하지 않은 원상태의 배열 temp2와 비교하여 인덱스값을 answer배열의 값으로 입력
			answer[i] = Arrays.asList(temp2).indexOf(temp[i]) + 1;
			// 정렬한 실패율 배열의 값에 해당하는 정렬하지 않은 실패율 배열의 인덱스 값을 찾고, 해당 인덱스 값을 -1로 대체(중복값을 없애기 위함)
			temp2[answer[i]-1] = (float)-1;
		}
		
		System.out.println("실패율이 높은 스테이지 순으로 정렬한 배열 : " + Arrays.toString(answer));
	}
}