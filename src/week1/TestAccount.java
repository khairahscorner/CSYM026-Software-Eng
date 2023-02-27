package week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAccount {
	private Account testAccount;

	@BeforeEach
	void setUp() throws Exception {
		testAccount = new Account("Airah", 10000);
	}

	@AfterEach
	void tearDown() throws Exception {
		testAccount = null;
	}

//	@Test
//	void testAccount() {
//		fail("Not yet implemented");
//	}

	@Test
	void testGetName() {
		assertEquals("Airah", testAccount.getName());
	}

	@Test
	void testCheckBalance() {
		assertEquals(10000, testAccount.checkBalance());
	}

	@Test
	void testDeposit() {
		testAccount.deposit(1000);
		assertEquals(11000, testAccount.checkBalance());
	}

	@Test
	void testWithdraw() {
		testAccount.withdraw(9000);
		assertEquals(1000, testAccount.checkBalance());
		testAccount.withdraw(2000);
		assertEquals(1000, testAccount.checkBalance());		
	}

}
