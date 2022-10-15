package methods;

public class Main {

	public static void main(String[] args) {
		 sayiBulmaca(); 
		 sayiBulmaca();  //burda maine aşağıdaki methodu çağırmış olduk.
		 sayiBulmaca(); 
		 sayiBulmaca(); 
	} 
	public static void sayiBulmaca() { //camelCaseing
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}  
		}
		
		String mesaj="";
		if(varMi) {
			mesajVer("sayı mevcut değildir:"+ aranacak);
			mesajVer(mesaj);
		}else {
			mesajVer("sayı mevcut değildir:"+ aranacak);
		}
	
	}
	public static void mesajVer(String mesaj) { //parametreli method denir .
		System.out.println(mesaj); 
	}
}
