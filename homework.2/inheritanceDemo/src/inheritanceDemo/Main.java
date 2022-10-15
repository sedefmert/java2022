package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		TarımKrediManager tarımKrediManager = new TarımKrediManager();
		
		KrediUI krediUI = new KredİUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
	}

}
// her class sadece bir tane classı extends edebilir. yani birden başka miras alamaz