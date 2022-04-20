package AdvanceTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTest {
    @RepeatedTest(5) //specifies to repeat the test number of times
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(bankAccount BankAccount){ // the value get passed through BankAccountParameterResolver.class i.e 0, 0
        BankAccount.deposit(400);
        assertEquals(400,BankAccount.getBalance());
    }

    @RepeatedTest(5) //specifies to repeat the test number of times
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(bankAccount BankAccount, RepetitionInfo repetitionInfo){ // the value get passed through BankAccountParameterResolver.class i.e 0, 0
        BankAccount.deposit(400);
        assertEquals(400,BankAccount.getBalance());
        System.out.println("Number: " + repetitionInfo.getCurrentRepetition()); //it will input the current number of repetition from the object created
    }


}
