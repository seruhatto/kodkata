package hanoi;

import java.util.ArrayList;
import java.util.Arrays;
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
		for (int i = discCount; i >= 1; i--) {
			HanoiDisc disc = new HanoiDisc(i);
			firsPeg.addDisc(disc);
		}

	}

	public List<HanoiPeg> getPegList() {
		return pegList;
	}

	public void step() {
		HanoiPeg peg1 = pegList.get(0);
		HanoiDisc disc = peg1.getListDisc().get(peg1.getListDisc().size() - 1);
		HanoiPeg peg2 = pegList.get(1);

		peg2.addDisc(disc);
		peg1.getListDisc().remove(peg1.getListDisc().size() - 1);

	}

	@Override
	public String toString() {
		String[][] strm = new String[discCount][pegsCount];
		int i = discCount;
		int j = pegsCount;
		for (HanoiPeg peg : pegList) {
			j--;
			List<HanoiDisc> discs = pegList.get(j).getListDisc();

			for (HanoiDisc disc : discs) {
				i--;
				strm[i][j] = disc.getIndex() + "";

			}

			i = discCount;
		}

		return Arrays.deepToString(strm).replace("],", "\n").replace(" [", "")
				.replace("[", "").replace("null", "").replace("]", "")
				.replace(",", "");
	}

	public boolean move(HanoiPeg pegFrom, HanoiPeg pegTo) {
		HanoiDisc lastDisc = pegFrom.getLastDisc();
		if (pegTo.addDisc(lastDisc)) {
			pegFrom.removeDisc(lastDisc);
			return true;
		}
		return false;
	}

	public HanoiPeg getAvailablePeg() {
		HanoiDisc disc = null;
		HanoiPeg apeg = null;
		for (HanoiPeg peg : pegList) {
			HanoiDisc lastDisc = peg.getLastDisc();
			if (disc == null) {
				disc = lastDisc;
				apeg = peg;
			} else if (lastDisc != null
					&& disc.getIndex() > lastDisc.getIndex()
					&& peg.getListDisc().size() > 1) {
				disc = peg.getLastDisc();
				apeg = peg;
			} else if (lastDisc != null
					&& disc.getIndex() < lastDisc.getIndex()) {

			}
		}
		return apeg;
	}

}
