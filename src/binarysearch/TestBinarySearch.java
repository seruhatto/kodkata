package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testBinarySearchIsEmpty()

    {
	Assert.assertEquals(-1,
		BinarySearch.findIndexWithBinarySearch(new Integer[] {}, 3));
    }

    @Test
    public void testBinarySearchNoElement() {
	Assert.assertEquals(-1, BinarySearch.findIndexWithBinarySearch(
		new Integer[] { 1, 5, 7 }, 3));
    }

    @Test
    public void testBinarySearchOneElement() {
	Assert.assertEquals(0,
		BinarySearch.findIndexWithBinarySearch(new Integer[] { 3 }, 3));
    }

    @Test
    public void testBinarySearchDoubleElement() {
	Assert.assertEquals(1, BinarySearch.findIndexWithBinarySearch(
		new Integer[] { 1, 3 }, 3));
	Assert.assertEquals(0, BinarySearch.findIndexWithBinarySearch(
		new Integer[] { 1, 3 }, 1));
    }

    @Test
    public void testBinarySearchMultipleElement() {
	Assert.assertEquals(
		6,
		BinarySearch.findIndexWithBinarySearch(new Integer[] { 1, 3, 5,
			7, 20, 22, 23, 25 }, 23));
    }

}
