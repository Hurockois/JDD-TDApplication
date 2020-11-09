import static org.junit.Assert.*;

import org.junit.Test;

public class OrangeTest {

	
	@Test	
	public void testEquivalenceOrange() {
		Orange o1 = new Orange ("France",1.10);
		Orange o2 = new Orange ("Floride",0.90);
		Orange o3 = new Orange ("Floride",0.90);
		
		assertNotEquals(o1,o2);
		assertEquals(o2,o3);
	}
	

}
