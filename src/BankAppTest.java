import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAppTest {

    @BeforeEach
    void setUp() {
        BankApp.balance = 1000;
    }

    @Test
    void testDeposit() {
        assertEquals(2000, BankApp.deposit(1000));
    }

    @Test
    void testWithdraw() {
        assertEquals("Withdrawal successful", BankApp.withdraw(300, "1234"));
        assertEquals(700, BankApp.balance);
    }

    @Test
    void testWithdrawWrongPin() {
        assertEquals("Wrong PIN", BankApp.withdraw(300, "0000"));
    }

    @Test
    void testWithdrawInsufficientFunds() {
        assertEquals("Insufficient funds", BankApp.withdraw(2000, "1234"));
    }
}