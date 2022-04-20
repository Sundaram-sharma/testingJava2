package AdvanceTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class) //injecting BankAccountParameterResolver.class
public class BankAccountDITest {
    // using dependency Injections in Test. Loosly coupled design using DI

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(bankAccount BankAccount){ // the value get passed through BankAccountParameterResolver.class i.e 0, 0
        BankAccount.deposit(400);
        assertEquals(400,BankAccount.getBalance());
    }


}
