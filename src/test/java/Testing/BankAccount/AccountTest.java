package Testing.BankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Tests for Bank Account Class")
class AccountTest {
	private Account account;

	@BeforeEach
	public void initTests(){
		account = new Account(500, -1000);
	}

	@Test
	@DisplayName("Withdraw with Balance greater than Minimum Balance")
	void withdrawBalanceGreaterThanMinimumBalance() {
		assertEquals(200, account.withdraw(300));
	}

	@Test
	@DisplayName("Withdraw without throwing Exceptions")
	void withdrawWithoutThrowingExceptions() {
		assertAll(() -> account.withdraw(50), () -> account.withdraw(450), () -> account.withdraw(780));
	}

	@Test
	@DisplayName("Withdraw not equals to Zero")
	void withdrawBalanceNotStuckAtZero() {
		assertNotEquals(0, account.withdraw(800));
	}

	@Test
	@DisplayName("Checking isActive Correct or Not")
	void isActiveTests() {
		assertTrue(account.getActive());
	}

	@Test
	@DisplayName("Checking Holder Name is Null")
	void isHolderNameNullTest() {
		assertNull(account.getHolderName());
	}

	@Test
	@DisplayName("Checking Checking Holder Name is not Null")
	void isHolderNameNotNullTest() {
		account.setHolderName("Dheeraj Kumar");
		assertNotNull(account.getHolderName());
	}

	@Test
	@DisplayName("Deposit Amount which is Positive")
	void depositWithPositiveAmount() {
		assertEquals(1500, account.deposit(1000));
	}

	@Test
	@DisplayName("Checking Deposit Speed")
	void depositTimeout() {
		assertTimeout(Duration.ofNanos(1), () -> account.deposit(1000));
	}

	@Test
	@DisplayName("Get Balance")
	void getBalance() {
		assertEquals(500, account.getBalance());
	}

	@Test
	@DisplayName("Get Minimum Balance")
	void getMinimumBalance() {
		assertEquals(-1000, account.getMinimumBalance());
	}

	@Test
	@DisplayName("isActive Assumption to be False")
	void isActiveTestsAssumptionFalse() {
		assumeFalse(account.getActive());
	}

	@Test
	@DisplayName("isActive Assumption to be True")
	void isActiveTestsAssumptionTrue() {
		assumeTrue(account.getActive());
	}

	@Test
	@DisplayName("isActive assumingthat()")
	void isActiveTestsAssumptionThat() {
		assumingThat(account.getActive(), () -> assertTrue(account.getActive()));
	}

	@Nested
	class whenAmountIsNegative {
		@Test
		@DisplayName("Withdraw with Balance Less than Minimum Balance")
		void withdrawBalanceLessThanMinimumBalance() {
			assertThrows(RuntimeException.class, () -> account.withdraw(2000));
		}

		@Test
		@DisplayName("Deposit Amount which is Negative")
		void depositWithNegativeAmount() {
			assertThrows(RuntimeException.class, () -> account.deposit(-1000));
		}
	}
}