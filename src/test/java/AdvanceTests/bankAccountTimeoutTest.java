package AdvanceTests;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@ExtendWith(BankAccountParameterResolver.class)
public class bankAccountTimeoutTest {

    @Test
    @Timeout(value = 600, unit = TimeUnit.MILLISECONDS)
    public void testDepositTimeoutAssertion(bankAccount Bankaccount){
        try{
            Thread.sleep(100); //the program will wait for the 1000milisec
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Bankaccount.deposit(300);
        assertEquals(300, Bankaccount.getBalance());
    }

    @Test
    public void testDepositTimeoutAssertion2(bankAccount Bankaccount){
        try{
            Thread.sleep(100); //the program will wait for the 100milisec
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Bankaccount.deposit(300);
        assertTimeout(Duration.ofMillis(500),() ->{
            Thread.sleep(10);
        });
    }
}
