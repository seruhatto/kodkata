package hanoi;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHanoiTowers {
	private HanoiTowers hanoiTower;

	@Before
	public void before() {
		hanoiTower = new HanoiTowers(4, 3);
		hanoiTower.init();
	}

	@After
	public void after() {
		System.out.println(hanoiTower.toString());
		System.out.println("----------");
	}

	@Test
	public void testHanoiInit() {

		HanoiPeg peg1 = hanoiTower.getPegList().get(0);

		assertEquals(1, peg1.getListDisc().get(3).getIndex());
		assertEquals(2, peg1.getListDisc().get(2).getIndex());
		assertEquals(3, peg1.getListDisc().get(1).getIndex());
		assertEquals(4, peg1.getListDisc().get(0).getIndex());

	}

	/**
	 * 1 -> 2 3 4
	 */
	@Test
	public void testgetAvailablePeg() {
		HanoiPeg peg = hanoiTower.getAvailablePeg();
		assertEquals(1, peg.getIndex());
	}

	/**
	 * 2 3 4 1
	 */
	@Test
	public void testAddDiscOneElement() {
		Iterator<HanoiPeg> pegs = hanoiTower.getPegList().iterator();
		HanoiPeg peg1 = pegs.next();
		HanoiPeg peg2 = pegs.next();
		if (hanoiTower.move(peg1, peg2)) {
			hanoiTower.toString();
		}

		assertEquals(peg2.getListDisc().get(0).getIndex(), 1);

		HanoiPeg peg = hanoiTower.getAvailablePeg();
		assertEquals(1, peg.getIndex());
	}

	/**
	 * 3 4 1 2
	 */
	@Test
	public void testAddDiscOneElement2() {
		testAddDiscOneElement();

		Iterator<HanoiPeg> pegs = hanoiTower.getPegList().iterator();
		HanoiPeg peg1 = pegs.next();
		HanoiPeg peg2 = pegs.next();
		if (hanoiTower.move(peg1, peg2)) {
			hanoiTower.toString();
		} else {
			HanoiPeg peg3 = pegs.next();
			if (hanoiTower.move(peg1, peg3)) {
				hanoiTower.toString();
			}
			assertEquals(peg3.getListDisc().get(0).getIndex(), 2);
		}

		HanoiPeg peg = hanoiTower.getAvailablePeg();
		assertEquals(2, peg.getIndex());
	}

}
