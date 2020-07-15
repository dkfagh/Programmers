import java.util.Arrays;

public class RetiredPlayer {

	public static void main(String[] args) {
		String participant[] = {"mislav", "stanko", "mislav", "ana"};
		String completion[] = {"stanko", "ana", "mislav"};
		
		String retired = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for(i = 0 ; i < completion.length ; i++) {
			if(!participant[i].equals(completion[i])) {
				retired += participant[i];
			}
		}
		
		if(retired.isEmpty()) {
			retired += participant[i];
		}
		
		System.out.println(retired);
	}
}