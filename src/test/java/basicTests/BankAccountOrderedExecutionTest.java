package basicTests;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //telling junit that the test will run in ordered annotations
public class BankAccountOrderedExecutionTest {


    static bankAccount BankAccount = new bankAccount(500,0); //setting the balance in bankAccountClass

    @Test
    @Order(2) //
    public void testWithdraw(){

        BankAccount.withdraw(300);
        assertEquals(100,BankAccount.getBalance());//compare the two objects

    }

    @Test
    @Order(1)
    public void testDeposit(){

        BankAccount.deposit(500);
        assertEquals(1000, BankAccount.getBalance());
    }

}
