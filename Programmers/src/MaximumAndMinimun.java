import java.util.Arrays;

public class MaximumAndMinimun {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		
		String answer = "";
		
		String[] temp = s.split(" ");
		
		// ÃÖ¼Ú°ª
		int min = Integer.parseInt(temp[0]);
		// ÃÖ´ñ°ª
		int max = Integer.parseInt(temp[0]);

		System.out.println(Arrays.toString(temp));
		
		for(int i = 0 ; i < temp.length ; i++) {
			if(Integer.parseInt(temp[i]) > max) {
				max = Integer.parseInt(temp[i]);
			} else if(Integer.parseInt(temp[i]) < min) {
				min = Integer.parseInt(temp[i]);
			}
		}
		
		System.out.println("min = " + min + " AND " + "max = " + max);
		
		answer = min + " " + max;
		System.out.println(answer);
	}

}