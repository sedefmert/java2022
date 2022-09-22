
public class Main {

	public static void main(String[] args) {
		String mesaj = "    Bugün hava çok güzel.    ";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : " +mesaj.length());		
		System.out.println("5.eleman :  " + mesaj.charAt(4))  ;  // charAt 5. indeksteki elemanı bulur.
		
		System.out.println(mesaj.concat("  yaşasın!")); //concat iki metni birleştirmek için kullanılabilir.
		
		System.out.println(mesaj.startsWith("A")); //metin a harfi ile başlıyor mu diye bakar.
		System.out.println(mesaj.endsWith(".")); //metin . ile bitiyor mu diye bakar
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5,karakterler, 0);  //0. indeksten başla 4. indekse kadar karakterler dizisinden ata.
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a')); //ilk hangi indekste a olduğunu bulur.
		System.out.println(mesaj.lastIndexOf('a')); //aramaya sağdan başlar indexof gibidir.
		
		System.out.println("------------------------------------");
		
		
		String yeniMesaj = mesaj.replace(' ', '-'); //belirtilen(eski) karakteri istenenle(yeni) değiştirir.
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2)); // mesajın hangi indeksten itibaren parçalandığını gösterir.
		System.out.println(mesaj.substring(2,5)); //2. indeksten başla 4.indekse kadar olan kısmı al.
		
		System.out.println("------------------------------------");
	
		for(String kelime : mesaj.split(" ")) { //  cümleyi kelime kelime alt alta yazdırır.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //mesajı küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase()); //mesajı büyük harfe çevirir.
		System.out.println(mesaj.trim()); // mesajın başındaki ve sonundaki boşlukları atar.
		
		
	}

}
  