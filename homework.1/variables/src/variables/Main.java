package variables;

public class Main {

	public static void main(String[] args) {
		
		
		double sayi = 5.3;   // ondalıklı değişkenleri tutan veri tipidir.
		String metin = "Öğrenci sayısı:"; // metin şeklindeki değişkenleri tutan veri tipidir.
		int ogrenciSayisi = 12; // tam sayı olan değişkenleri tutan veri tipidir.
		boolean dogruMu = true ; // true,false değişkenlerini tutan veri tipidir.
		char karakter = 's'; // karakter değişkenlerini tutan veri tipidir.
				
				
		System.out.println( sayi );
		System.out.println( metin );
		System.out.println( ogrenciSayisi );
		System.out.println( dogruMu );
		System.out.println( karakter );
		System.out.println("Öğrenci sayım:" + ogrenciSayisi );
		System.out.println(metin + ogrenciSayisi );
		System.out.println( dogruMu );
		System.out.println( metin + dogruMu );

	}

}
