package prime_number;

public class Main {

	public static void main(String[] args) {
		
		
		int number = 2 ;
		int i=2;
		int remainder = number % i;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("asal sayı değildir.");
			return;
		}  													/* 1 ve 1den küçük sayıların
		 											bug oluşturmasını engellemek için kullanılır.*/
		if(number<1) {
			System.out.println("geçersiz sayı");
			
			
		}
		for(i=2;i<number;i++) {
			if(number % i == 0) { // sayı 2 olduğunda for döngüsüne hiç girmez.
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("asal sayıdır"); // boolean ifadesi true olduğunda çalışır.
		}else {
			System.out.println("asal sayı  değildir.");
		}
	
	}

}
