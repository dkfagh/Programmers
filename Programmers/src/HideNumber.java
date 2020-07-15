
public class HideNumber {

	public static void main(String[] args) {
		String phone_number = "221555456484";
		
		// 주어진 번호의 뒤 4자리를 제외한 앞의 숫자를 *로 치환
		String temp = phone_number.substring(0, phone_number.length()-4).replaceAll(".", "*");

		// 위에서 생성한 temp값과 기존 번호의 뒤 4자리를 결합
		String answer = temp + phone_number.substring(phone_number.length()-4, phone_number.length());
		
		System.out.println(answer);
	}

}