package hanoi;

import java.util.LinkedList;
import java.util.List;

public class HanoiPeg {

	private int index;
	private List<HanoiDisc> listDisc = new LinkedList<HanoiDisc>();

	public List<HanoiDisc> getListDisc() {
		return listDisc;
	}

	public HanoiPeg(int index) {
		this.setIndex(index);
	}

	public boolean addDisc(HanoiDisc disc) {
		if (!listDisc.contains(disc) && available(disc)) {
			return listDisc.add(disc);
		}
		return false;
	}

	private boolean available(HanoiDisc disc) {
		for (HanoiDisc hDisc : listDisc) {
			if (hDisc.getIndex() < disc.getIndex()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String str = "";
		for (HanoiDisc disc : listDisc) {
			str = (+disc.getIndex() + "\n") + str;
		}
		return str;
	}

	public void removeDisc(HanoiDisc disc) {
		listDisc.remove(disc);
	}

	public HanoiDisc getLastDisc() {
		if (!getListDisc().isEmpty()) {
			return getListDisc().get(this.getListDisc().size() - 1);
		} else {
			return null;
		}

	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
