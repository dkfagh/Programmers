
public class FindKIm {

	public static void main(String[] args) {
		String[] Seoul = {"Jane", "Yang", "Kim"};
		
		int x = 0;
		
		for(int i = 0 ; i < Seoul.length ; i++) {
			if(Seoul[i].equals("Kim")) {
				x = i;
			}
		}
		
		System.out.println("김서방은 " + x + "에 있다.");
	}

}