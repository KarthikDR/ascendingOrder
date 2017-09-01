package com.ascending;
import org.junit.Test;
import static org.junit.Assert.*;

import junit.framework.TestCase;

public class ascendTest extends TestCase {
	
	@Test
	public void testAscend()
	{
	int[] d = {0,0,4,7,2,4,5,6}; 
	int[] e = {0,0,2,4,4,5,6,7}; 
	App bObject  = new App() ;
	d = bObject.ascend(d);
	assertArrayEquals("Comparison of Arrays",d,e);
	}

}
