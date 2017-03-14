package com.Datastructure.ArrayUtil;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayUtilTest {
	private ArrayUtil arrutil;

	@Before
	public void setUp() throws Exception {
		arrutil=new ArrayUtil();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseArray() {
		int a[]={7,9,30,3};
		arrutil.reverseArray(a);
	}

	@Test
	public void testRemoveZero() {
		int old[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int ne[]=arrutil.removeZero(old);
	}

	@Test
	public void testMerge() {
		fail("Not yet implemented");
	}

	@Test
	public void testGrow() {
		fail("Not yet implemented");
	}

	@Test
	public void testFibonacci() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrimes() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPerfectNumbers() {
		fail("Not yet implemented");
	}

	@Test
	public void testJoin() {
		fail("Not yet implemented");
	}

}
