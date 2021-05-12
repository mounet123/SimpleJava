package com.formation;
import com.formation.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCalcul {
	Calculator c =new Calculator();
	@Test
	public void testadd() {
	
		Assertions.assertEquals(50, c.add(25, 25));
		
	}
	@Test

	public void testmultip() {
		
		Assertions.assertEquals(15, c.multiplay(3,5));
		
	}

}
