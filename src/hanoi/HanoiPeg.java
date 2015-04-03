package hanoi;

import java.util.LinkedList;
import java.util.List;

public class HanoiPeg {

	private int index;
	private List<HanoiDisc> listDisc = new LinkedList<HanoiDisc>();
	
	public HanoiPeg(int index) {
		this.index = index;
	}

	public void addDisc(HanoiDisc disc) {
 		listDisc.add(disc);
	}

	@Override
	public String toString() {
		String str="";
		for(HanoiDisc disc :listDisc){
			str += disc.getIndex()+"\n";
		}
 		return str;
	}
}
