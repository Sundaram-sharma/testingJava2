package AdvanceTests;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class bankAccountBeforeAndAfterTest {

    static bankAccount BankAccount;
    @BeforeAll
    public void prepTest(){
        System.out.println("Hi!");
        BankAccount = new bankAccount(500,0); //setting the balance in bankAccountClass

    }

    @Test
    public void testWithdraw(){

        BankAccount.withdraw(300);
        assertEquals(100,BankAccount.getBalance());//compare the two objects

    }

    @Test
    public void testDeposit(){

        BankAccount.deposit(500);
        assertEquals(1000, BankAccount.getBalance());
    }

    @AfterAll
    public static void endTest(){
        System.out.println("Bye for now");
    }
}
