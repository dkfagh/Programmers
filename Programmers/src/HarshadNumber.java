
public class HarshadNumber {

	public static void main(String[] args) {
		
		boolean answer = false;
		
		int x = 18;
		
		// 각 자릿수 구하기
		int a = x/1000;
		int b = (x/100)%10;
		int c = (x/10)%10;
		int d = x%10;
		
		// 각 자릿수의 합
		int temp = a + b + c + d;
		
		//하샤드 수 검증
		if(x%temp == 0) {
			answer = true;
		}
		
		System.out.println(answer);
	}

}