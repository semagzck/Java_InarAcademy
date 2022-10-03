package weeks.week_04;

public class interview_2 {

	public static void main(String[] args) {
		String temp = "Java is Fun";
		
		int i = 0;
		
		for(i = 0; i < temp.length(); i++) {
			char ch = temp.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				temp = temp.replace(ch, 'X');
			}
			
		}
		System.out.println(temp);
	}

}
