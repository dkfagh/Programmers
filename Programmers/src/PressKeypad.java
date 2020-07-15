
public class PressKeypad {

	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		
		String hand = "right";
		
		String answer = "";
		
		// �޾���, ���������� ��ġ(�ӽ�)
		int left = 10;
		int right = 10;
		
		for(int i = 0 ; i < numbers.length ; i++) {
			
			// 1, 4, 7�� ������ �޾���
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				
				answer += "L";
				left = numbers[i];
				
			// 3, 6, 9�� ������ ��������
			} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				
				answer += "R";
				right = numbers[i];
				
			} else {
				// �ش� ���ڰ��� ���� �޾����� ���������� �Ÿ�
				
				// ���������� �� ����� ��� (�޾����� �� �� ���)
				if(distance(left, numbers[i]) > distance(right, numbers[i])) {
					
					answer += "R";
					right = numbers[i];
					
				// �޾����� �� ����� ��� (���������� �� �� ���)
				} else if(distance(left, numbers[i]) < distance(right, numbers[i])) {
					
					answer += "L";
					left = numbers[i];
					
				// �� �������� �Ÿ��� ���� ���
				} else {
					
					// ������������ ���
					if(hand.equals("right")) {
						answer += "R";
						right = numbers[i];
					
					// �޼������� ���
					} else {
						answer += "L";
						left = numbers[i];
					}
				}
				
			}
		}
		
		System.out.println(answer);

	}
	
	// �� �� n�� m�� �Ÿ�
	public static int distance(int n, int m) {
		
		int[][] keypad = {{1,2,3},
						  {4,5,6},
						  {7,8,9},
						  {10,0,10}};
		
		// �� �� n�� m�� ��ǥ��
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