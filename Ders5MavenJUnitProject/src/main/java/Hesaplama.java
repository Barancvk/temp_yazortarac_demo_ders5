
public class Hesaplama {
	
	/**
	 * Tam sayi toplama yapmayı saglayan metod 
	 * @param sayi1
	 * @param sayi2
	 * @return
	 */
	public static int toplama(int sayi1, int sayi2) {
		
		return sayi1 + sayi2;
	}
	/**
	 * Sinirsiz adet tam sayi için toplama yapmayi saglayan metod
	 * 
	 * @param sayilar sayilar toplanacak tam sayi degeleri dizisi
	 * @return sayilarin toplami döner
	 */
	public static int toplama(int [] sayilar) {
		int toplam = 0;
		for(int i = 0;i<sayilar.length;i++) {
			toplam+= sayilar[i];
		}
		return toplam;
	}
	

}
