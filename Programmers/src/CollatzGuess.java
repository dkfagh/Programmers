
public class CollatzGuess {

	public static void main(String[] args) {
		
		int n = 626331;
		
		// int형은 자릿수 제한이 있기떄문에 형변환
		long x = n;
		
		int answer = 0;
		
		while(answer<500) {
			
			if(x==1) {
				break;
			}
			
			if(x%2==0) {
				x = x/2;
			} else {
				x = x*3 + 1;
			}
						
			answer++;
						
		}
		
		if(answer==500) {
			answer = -1;
		}
				
		System.out.println(answer);
	}

}