
public class Main {

	public static void main(String[] args) {
		
		//    if-else
		
		int sayi = 20 ;
		if(sayi<20) {
			System.out.println("Sayı 20'den küçüktür.");
		}else if(sayi==20){
			System.out.println("Sayı 20 ye eşittir.");
		}else {
			System.out.println("Sayı 20'den küçük değildir.");
		
		}
	
	// en büyük sayının tespiti;
		
	int sayi1 = 20;
	int sayi2 = 25;
	int sayi3 = 2;
	
	int enBuyuk = sayi1;
	
	/*	if(sayi1>sayi2) {
		if(sayi1>sayi3) {
			System.out.println("En büyük sayı:" + sayi1);    //1.yöntem
		}
	}else if (sayi2>sayi3) {
	System.out.println("En büyük sayı:" + sayi2);
	}else {
		System.out.println("En büyük sayı: " + sayi3);
	}
 
	
	*/
	
	if(enBuyuk<sayi2) {
		enBuyuk = sayi2;
	}
															// 2. yöntem
	if(enBuyuk<sayi3) { 
		enBuyuk = sayi3;
	}
	System.out.println("En büyük sayı: " + enBuyuk);
	
	
	//   switch-case
	
	
	char grade = 'A';
	
	
	switch(grade) {
		case 'A':
			System.out.println("Mükemmel,geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok güzel,geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi,geçtiniz.");
			break;	
		case 'D':
			System.out.println("Fena değil,geçtiniz.");
			break;
		case 'F':
			System.out.println("Maalesef ,kaldınız .");
			break;	
			default :
				System.out.println("Geçersiz not girdiniz");
	}
	
	
	}
}
