
public class watermelon {

	public static void main(String[] args) {
		int n = 12;
		
		String answer = "";
		
		for(int i = 1 ; i <= n ; i++) {
			
			if(i%2 == 1) {
				answer+="��";
			} else {
				answer+="��";
			}
		}
		
		System.out.println(answer);

	}

}