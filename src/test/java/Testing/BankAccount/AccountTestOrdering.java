package Testing.BankAccount;

import com.beust.ah.A;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AccountTestOrdering {
	static Account account = new Account(0, 0);

	@Test
	@Order(2)
	void withdrawTest() {
		assertEquals(800, account.withdraw(200));
	}

	@Test
	@Order(1)
	void depositTest() {
		assertEquals(1000, account.deposit(1000));
	}
}
