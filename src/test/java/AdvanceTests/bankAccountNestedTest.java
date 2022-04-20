package AdvanceTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class bankAccountNestedTest {

    @Test
    @DisplayName("Withdraw 300 successfully") //custom Display Name for tests
    public void testWithdraw() {
        bankAccount BankAccount = new bankAccount(500, -1000); //creating instance
        BankAccount.withdraw(300);
        assertEquals(200, BankAccount.getBalance()); //assertEqual will check if two methods are equal or not.

    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit() {
        bankAccount BankAccount = new bankAccount(400, -1000); //creating instance
        BankAccount.deposit(400);
        assertEquals(800, BankAccount.getBalance());
    }

    @Nested //to execute the nested tests as well
    class whenBalanceEqualsZero {

        @Test
        @DisplayName("Withdrawing below minimum balance: Exception")
        public void testWithdrawBalanceIs0() {
            bankAccount BankAccount = new bankAccount(0, 0);
            assertThrows(RuntimeException.class, () -> BankAccount.withdraw(500));

        }

        @Test
        @DisplayName("Withdraw and getting negative balance")
        public void testWithdrawMinimumBalanceNegative1000() {
            bankAccount BankAccount = new bankAccount(0, -1000);
            BankAccount.withdraw(500);
            assertEquals(-500, BankAccount.getBalance());
        }


    }



}
