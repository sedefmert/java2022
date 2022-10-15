package methods2;

public class Main {

	public static void main(String[] args) { 
		String mesaj="bugün hava çok güzel.";
		String yeniMesaj= sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(9,17);
		System.out.println(sayi); 
		int toplam = topla2(2,3,4,5,6,7,10);
		System.out.println(toplam);     
	}
	
	public static void ekle() {    					//methotlar kendimizi tekrar etmemek için kullanılır.
		System.out.println("eklendi."); 			//Belli bir iş verilip bu işi farklı yerlerde çağırabiliriz.
	}
	
	public static void sil() { 
		System.out.println("silindi."); 
	}
	
	public static void guncelle() {
		System.out.println("güncellendi."); 
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) { //sayilardaki her bir sayı için demek 
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "istanbul";
	}
}
