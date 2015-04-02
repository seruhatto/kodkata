package faktoriyel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestFaktoriyel {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void sifirSonucuBir() {
		assertEquals(1, Faktoriyel.hesapla(0));
	}

	@Test
	public void birFaktoriyerBir() {
		assertEquals(1, Faktoriyel.hesapla(1));
	}

	@Test
	public void ikiFaktoriyelIki() {
		assertEquals(2, Faktoriyel.hesapla(2));
	}

	@Test
	public void NFaktoriyelSonuc() {
		int n = 10;
		int sonuc = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
		assertEquals(sonuc, Faktoriyel.hesapla(n));
	}

	@Test
	public void maxIntegerOutOfRange() {
		long n = 100;
		try {
			System.out.println(Faktoriyel.hesapla(n));
		} catch (Exception e) {
			assertEquals("OutOfRange", "OutOfRange", e.getMessage());
		}
	}

	@Test
	public void negatifHesaplama() {
		int n = -1;
		try {
			Faktoriyel.hesapla(n);

		} catch (ArithmeticException e) {
			assertEquals("Negatif Sayýlar Hesaplanamaz.", Faktoriyel.MESAJ_NEGATIF, e.getMessage());

		}
	}
	
}
