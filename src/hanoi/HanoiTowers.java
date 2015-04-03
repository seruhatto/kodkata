package hanoi;

import java.util.ArrayList;
import java.util.List;

public class HanoiTowers {

	private int discCount;
	private int pegsCount;
	private List<HanoiPeg> pegList = new ArrayList<HanoiPeg>();

	public HanoiTowers(int discCount, int pegsCount) {
		this.discCount = discCount;
		this.pegsCount = pegsCount;
	}

	public void iterate() {

	}

	public void init() {
		for (int i = 1; i <= pegsCount; i++) {
			HanoiPeg peg = new HanoiPeg(i);
			pegList.add(peg);
		}

		HanoiPeg firsPeg = pegList.get(0);
		for(int i = discCount ; i>=1;i--){
			HanoiDisc disc = new HanoiDisc(i);
			firsPeg.addDisc(disc);
		}

		System.out.println(firsPeg.toString());

	}

}
