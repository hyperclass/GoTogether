package goTogetherTest;

import static org.junit.Assert.*;
import goTogether.goTogetherMain;

import org.junit.Test;

public class geTogetherTest {

	@Test
	public void testTest() {
		
	
		goTogetherMain mTogether = new goTogetherMain();
		
		assertEquals(30, mTogether.test(5,6));
		
	}

}
