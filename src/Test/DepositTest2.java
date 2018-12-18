package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest2 {

	@Test
	public void testDeposit1() {
		
		//Test class
		DepositCalculator test = new DepositCalculator();
		
		//Test method
		assertEquals(15730.4, test.Deposit(14000.0 , 6.0, 2),0.1);
	}
}
