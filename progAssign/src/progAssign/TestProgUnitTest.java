package progAssign;

import progAssign.TestProg;

import static org.junit.Assert.*;
import org.junit.*;


public class TestProgUnitTest {
	
	public final double DELTA  = 1e-25;

	
	@Test 
	//tests different conditions of setDeposit method
	public void testSetDeposit() {
		
		TestProg testP = new TestProg();
		boolean b;
		
		b = testP.setDeposit(".45");
		assertFalse("deposits must have digit before decimal pt", b);
		
		b = testP.setDeposit("45.");
		assertFalse("deposits must have digit after decimal pt", b);
		
		b = testP.setDeposit("-2.45");
		assertFalse("deposits cannot be negative values", b);
		
		b = testP.setDeposit("2");
		assertFalse("deposits must have decimal pt", b);
		
		b = testP.setDeposit("2.2.1");
		assertFalse("deposits cannot have more than 1 decimal pt", b);
		
		b = testP.setDeposit("`~!@#$%^&*()_=+{[]}|;:,<>/?");
		assertFalse("deposits cannot use special characters", b);
		
		b = testP.setDeposit("dgfdhfdghfHJGGJHHGJH");
		assertFalse("deposits cannot use letters", b);
		
		b = testP.setDeposit("2.456");
		assertFalse("deposits cannot have more than 2 digits after decimal pt", b);
		
		b = testP.setDeposit("2.4");
		assertTrue("deposits can have 1 digit after decimal pt", b);
		
		b = testP.setDeposit("2.45");
		assertTrue("deposits can have 2 digits after decimal pt", b);
	}
	
		@Test
		//tests different conditions of setWithdraw method
		public void testSetWithdraw() {
			
			TestProg testP = new TestProg();
			boolean b;
			
			b = testP.setWithdraw(".45");
			assertFalse("withdrawal must have digit before decimal pt", b);
			
			b = testP.setWithdraw("45.");
			assertFalse("withdrawal must have digit after decimal pt", b);
			
			b = testP.setWithdraw("-2.45");
			assertFalse("withdrawal cannot use negative values", b);
			
			b = testP.setWithdraw("2");
			assertFalse("withdrawal must have decimal pt", b);
			
			b = testP.setWithdraw("2.3.4");
			assertFalse("withdrawal cannot have more than 1 decimal pt", b);
			
			b = testP.setWithdraw("`~!@#$%^&*()_=+{[]}|;:,<>/?");
			assertFalse("withdrawal cannot use special characters", b);
			
			b = testP.setWithdraw("dgfdhfdghfHJGGJHHGJH");
			assertFalse("withdrawal cannot use letters", b);
			
			b = testP.setWithdraw("2.456");
			assertFalse("withdrawal cannot have more than 2 digits after decimal pt", b);
			
			b = testP.setWithdraw("2.4");
			assertTrue("withdraw can have 1 digit after decimal pt", b);
			
			b = testP.setWithdraw("2.45");
			assertTrue("withdraw can have 2 digits after decimal pt", b);

		}
		
		@Test
		//tests functionality of getBalance method
		
		public void testGetBalance() {
			
			TestProg testP = new TestProg();
			double balance;
			
			testP.setDeposit("1.23");
			testP.setDeposit("15000.56");
			testP.setDeposit("100.99");
			testP.setDeposit("11.3");
			testP.setWithdraw("75.23");
			testP.setWithdraw("5.3");
			
			balance = testP.getBalance();
			
			assertEquals(balance, 15033.55, DELTA);
					
					
					
		}

}
