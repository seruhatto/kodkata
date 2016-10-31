package hanoi;

public class HanoiDisc {

	private int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public HanoiDisc(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return String.valueOf(index);
	}

	@Override
	public boolean equals(Object obj) {
		return index == ((HanoiDisc) obj).getIndex();
	}

}
