package basicTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
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

    @Test
    @DisplayName("Test activation account after creation")
    public void testActive(){
        bankAccount BankAccount = new bankAccount(500,-1000);
        //assumeTrue(BankAccount != null,"Account is null"); // assume if the account is null or not. test will run only if conditions are met
        assumingThat(BankAccount == null, ()-> assertTrue(BankAccount.isActive())); //assumingThat will combine assertTrue and assumeTrue
        //assertTrue(BankAccount.isActive()); checking if the value is 'true'. Also there is 'assumeFalse'

    }

    @Test
    @DisplayName("Test set holder name")
    public void testHolderName(){
        bankAccount BankingAccount = new bankAccount(500,0);
        BankingAccount.setHolderName("Henry");

        assertNotNull(BankingAccount.getHolderName()); // check the holder name is empty or not

    }

    @Test
    @DisplayName("Test that we can't withdraw below minimum")
    public void testNoWithdrawBelowMinimun(){
        bankAccount BankAccount = new bankAccount(500,0);
        assertThrows(RuntimeException.class, ()->BankAccount.withdraw(2000)); //to check if the RuntimeException.class will be thrown or not as withdraw amount is more than minimum balance
    }

    @Test
    @DisplayName("Test no exception for withdraw and deposit")
    public void testDepositAndWithDrawWithoutExceptions() {
        bankAccount BankAccount = new bankAccount(500, -1000);
        assertAll( ()-> BankAccount.deposit(200), ()-> BankAccount.withdraw(450) );
    }

    @Test
    @DisplayName("Time took to deposit")
    public void testDepositTimeout(){
        bankAccount BankAccount = new bankAccount(400,0);
        assertTimeout(Duration.ofNanos(1), ()-> BankAccount.deposit(200));


    }



}
