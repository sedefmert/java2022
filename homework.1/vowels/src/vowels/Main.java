package vowels;

public class Main {

	public static void main(String[] args) {
		char harf = 'a';
		
		
		switch(harf) {
			case'a':
			case'ı':
			case'o':
			case'u':
				System.out.println("Kalın sesli harfler");
				break;
				default;  // yukarıdaki caseler dışındaki durumlar için ne olacağına karar vermemizi sağlar.
					System.out.println("ince sesli harfler");
		}
		
	}

}
