

public class app {
	public static void main(String[] args) {
		String Id = "A4353453221";
		int prize = 25;
		int len = Id.length()-1;
		char first = Id.charAt(0);
		switch (len){
			case 6:
				prize=prize;
				break;
			case 8:
				prize=prize*4;
				break;
			case 10:
				prize=prize*16;
				break;
		}
		switch (first){
			case 'A': System.out.println(prize);
				break;
			case 'B': System.out.println(prize*2);
				break;
			case 'C': System.out.println("None");
				break;
		}

	}
}
