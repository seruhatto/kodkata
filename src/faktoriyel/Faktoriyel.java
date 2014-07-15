package level.basic;

public class Faktoriyel {
	public static String MESAJ_NEGATIF = "Negatif Sayýlar Ýçin Faktoriyel Hesabý Yapýlamaz.";

	public static long hesapla(long sayi) throws ArithmeticException {
		long sonuc=1;
 		if (sayi < 0) {
			throw new ArithmeticException("Negatif Sayýlar Ýçin Faktoriyel Hesabý Yapýlamaz.");
		} else if (sayi == 0) {
			return sonuc;
		} else {
			sonuc=sayi * hesapla(sayi - 1);
			System.out.println(sonuc);
			if(Long.signum(sonuc)==-1) {
				throw new ArithmeticException("OutOfRange");
			}
			return sonuc;
		}
	}
}
