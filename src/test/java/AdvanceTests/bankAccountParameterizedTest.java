package AdvanceTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class bankAccountParameterizedTest {
    @ParameterizedTest //Parameterized test is to execute the same test over and over again using different values.
    @ValueSource(ints = {100, 400, 800, 1000}) //provide the arguments for each invocation of test
    @DisplayName("Deposit 400 successfully")
    public void testDepositValueSource(int amount, bankAccount BankAccount){
        BankAccount.deposit(amount);
        assertEquals(amount,BankAccount.getBalance());
    }
}
