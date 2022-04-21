package AdvanceTests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Execution(ExecutionMode.CONCURRENT) // enable this to run test in parallel
@ExtendWith(BankAccountParameterResolver.class) //DI
public class bankAccountParallelExecutionTest {

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit(bankAccount BankAccount){ // the value get passed through BankAccountParameterResolver.class i.e 0, 0
        try{
            Thread.sleep(200); //the program will wait for the 1000milisec
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        BankAccount.deposit(500);
        assertEquals(500,BankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit2(bankAccount BankAccount){ // the value get passed through BankAccountParameterResolver.class i.e 0, 0
        try{
            Thread.sleep(2000); //the program will wait for the 1000milisec
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        BankAccount.deposit(500);
        assertEquals(500,BankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit3(bankAccount BankAccount){ // the value get passed through BankAccountParameterResolver.class i.e 0, 0
        try{
            Thread.sleep(1200); //the program will wait for the 1000milisec
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        BankAccount.deposit(500);
        assertEquals(500,BankAccount.getBalance());
    }


}
