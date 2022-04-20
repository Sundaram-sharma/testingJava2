package basicTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testing Bank Account")
public class bankAccountTest {

    @Test
    @DisplayName("Withdraw 300 successfully") //custom Display Name for tests
    public void testWithdraw(){
        bankAccount BankAccount = new bankAccount(500,-1000); //creating instance
        BankAccount.withdraw(300);
        assertEquals(200,BankAccount.getBalance()); //assertEqual will check if two methods are equal or not.

    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(){
        bankAccount BankAccount = new bankAccount(400,-1000); //creating instance
        BankAccount.deposit(400);
        assertEquals(800,BankAccount.getBalance());
    }

    @Test
    @DisplayName("Withdraw will become negative")
    public void testWithdrawNotStuckAtZero(){
        bankAccount BankAccount = new bankAccount(500,-1000); //creating instance
        BankAccount.withdraw(900);
        assertNotEquals(0,BankAccount.getBalance());//compare two to check if they are not equal
    }

}
