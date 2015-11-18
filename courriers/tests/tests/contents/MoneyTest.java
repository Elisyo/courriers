package tests.contents;

import static org.junit.Assert.*;

import org.junit.Test;

import courriers.content.Money;

public class MoneyTest {

	@Test
	public void positiveAmountGenerator(){
		assertTrue(new Money().getAmount() > 0);
	}
	
}
