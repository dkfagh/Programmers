import java.util.Arrays;
import java.util.Collections;

public class FailureRate {

	public static void main(String[] args) {
		// �������� ����
		int N = 5;
		
		// ����ڰ� �����ִ� �������� ��ȣ
		int[] stages = {2,1,2,6,2,4,3,3};
		// ù ������������ �����ϴ� ������� ��
		int attempt = stages.length;
		
		// ������ �Ǽ����� ������ Float�� �ӽ� �迭
		Float[] temp = new Float[N];
		
		int[] answer = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			
			// �ش� ������������ �����ִ� ������� ��
			int count = 0;
			
			for(int item : stages) {
				
				if(item == i+1) {
					count++;
				}
			}
			
			System.out.println("��������" + (i+1) + "���� �����ִ� ����� �� : " + count);
			System.out.println("��������" + (i+1) + "�� ������ ����� ��  : " + attempt);
						
			if(attempt != 0) {
				temp[i] = (float)count/attempt;
			// �ش� ���������� ������ ����ڰ� ���� ���
			} else {
				temp[i] = (float)0;
			}
			
			attempt -= count;
			System.out.println("��������" + (i+1) + "�� �Ϸ��� ����� �� : " + attempt);
			System.out.println("��������" + (i+1) + "�� ������ : " + temp[i]);
			System.out.println();
		}
		
		// temp�迭�� ����
		Float[] temp2 = temp.clone();
		System.out.println("������������ �������� ���� ������ �迭 : " + Arrays.toString(temp2));
		
		// ���������� �������� ��� temp�迭�� ������������ ����
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println("������������ ������ ������ �迭 : " + Arrays.toString(temp));
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.println(temp[i]);
			System.out.println(Arrays.asList(temp2).indexOf(temp[i]) + 1);
			
			// �������� ������������ ������ temp�迭�� ���� �ϳ��� �̾Ƽ� �������� ���� �������� �迭 temp2�� ���Ͽ� �ε������� answer�迭�� ������ �Է�
			answer[i] = Arrays.asList(temp2).indexOf(temp[i]) + 1;
			// ������ ������ �迭�� ���� �ش��ϴ� �������� ���� ������ �迭�� �ε��� ���� ã��, �ش� �ε��� ���� -1�� ��ü(�ߺ����� ���ֱ� ����)
			temp2[answer[i]-1] = (float)-1;
		}
		
		System.out.println("�������� ���� �������� ������ ������ �迭 : " + Arrays.toString(answer));
	}
}