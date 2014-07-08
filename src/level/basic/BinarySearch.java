package level.basic;

/**
 * �kili Arama, s�ral� bir dizide, belirli de�erin bulunmas�na y�nelik bir algoritmad�r.
 * 
 * @author Seruhatto
 * 
 */
public class BinarySearch {
	public static int findIndexWithBinarySearch(Integer list[], int searchVal) {
		int beginIndex = 0;
		int endIndex = list.length - 1;

		if (list.length > 0) {
			while (beginIndex <= endIndex) {
				int midIndex = ((endIndex + beginIndex) >>> 1);
				int midVal = list[midIndex];
				if (midVal == searchVal) {
					return midIndex;
				} else if (midVal > searchVal) {
					endIndex = midIndex - 1;
				} else if (midVal < searchVal) {
					beginIndex = midIndex + 1;
				}
			}
		}
		return -1;
	}
}
