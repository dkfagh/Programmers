
public class PressKeypad {

	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		
		String hand = "right";
		
		String answer = "";
		
		// 왼엄지, 오른엄지의 위치(임시)
		int left = 10;
		int right = 10;
		
		for(int i = 0 ; i < numbers.length ; i++) {
			
			// 1, 4, 7은 무조건 왼엄지
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				
				answer += "L";
				left = numbers[i];
				
			// 3, 6, 9는 무조건 오른엄지
			} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				
				answer += "R";
				right = numbers[i];
				
			} else {
				// 해당 숫자값에 대한 왼엄지와 오른엄지의 거리
				
				// 오른엄지가 더 가까울 경우 (왼엄지가 더 멀 경우)
				if(distance(left, numbers[i]) > distance(right, numbers[i])) {
					
					answer += "R";
					right = numbers[i];
					
				// 왼엄지가 더 가까울 경우 (오른엄지가 더 멀 경우)
				} else if(distance(left, numbers[i]) < distance(right, numbers[i])) {
					
					answer += "L";
					left = numbers[i];
					
				// 두 엄지와의 거리가 같을 경우
				} else {
					
					// 오른손잡이인 경우
					if(hand.equals("right")) {
						answer += "R";
						right = numbers[i];
					
					// 왼손잡이인 경우
					} else {
						answer += "L";
						left = numbers[i];
					}
				}
				
			}
		}
		
		System.out.println(answer);

	}
	
	// 두 수 n과 m의 거리
	public static int distance(int n, int m) {
		
		int[][] keypad = {{1,2,3},
						  {4,5,6},
						  {7,8,9},
						  {10,0,10}};
		
		// 두 수 n과 m의 좌표값
		int x = 10;
		int y = 10;
		
		int a = 10;
		int b = 10;
		
		for(int i = 0 ; i < keypad.length ; i++) {
			
			for(int j = 0 ; j < keypad[i].length ; j++) {
				
				if(keypad[i][j] == n) {
					x = i;
					y = j;
				}
				if(keypad[i][j] == m) {
					a = i;
					b = j;
				}
			}
		}
		
		int answer = Math.abs(x-a) + Math.abs(y-b);
		
		return answer;
	}
}