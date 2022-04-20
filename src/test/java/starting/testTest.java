package starting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTest {

    @Test //annotation to run the test case
    public void testSayHello(){
        code Code = new code(); //creating instance of starting.code

        assertEquals("Hello World", code.sayHello());

    }
}