package hanoi;

import org.junit.Test;

public class TestHanoiTowers {

	@Test
	public void testHanoiInit() {
		HanoiTowers hanoiTower = new HanoiTowers(4,3);
		hanoiTower.init();
	}

}
