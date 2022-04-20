package basicTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class bankAccountTest {

    @Test
    public void testWithdraw(){
        bankAccount BankAccount = new bankAccount(500,-1000); //creating instance
        BankAccount.withdraw(300);
        assertEquals(200,BankAccount.getBalance()); //assertEqual will check if two methods are equal or not.

    }

    @Test
    public void testDeposit(){
        bankAccount BankAccount = new bankAccount(400,-1000); //creating instance
        BankAccount.deposit(400);
        assertEquals(800,BankAccount.getBalance());
    }

}
