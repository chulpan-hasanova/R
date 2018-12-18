package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest {
	
	@Test
	public void testDeposit() {
		
		//Test class
		DepositCalculator test = new DepositCalculator();

		//Test method
		assertEquals(49172.48, test.Deposit(35000.0 , 12.0, 3),0.1);
	}

}
