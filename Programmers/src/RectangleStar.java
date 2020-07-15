import java.util.Scanner;

public class RectangleStar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		for(int i = 0 ; i < b ; i++) {
			for(int j = 0 ; j < a ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}