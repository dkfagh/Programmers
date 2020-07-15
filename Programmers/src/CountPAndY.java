
public class CountPAndY {

	public static void main(String[] args) {
		String s = "pPoooY";
		
		
		String[] temp = s.split("");
		
		int countP = 0;
		int countY = 0;
		
		for(int i = 0 ; i < temp.length ; i++) {
			if(temp[i].equals("p") || temp[i].equals("P")) {
				countP++;
			} else if(temp[i].equals("y") || temp[i].equals("Y")) {
				countY++;
			}
		}
		
		if(countP == countY) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
