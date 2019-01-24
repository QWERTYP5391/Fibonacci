import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class FibonacciTest {



    @Test
    public void get5() {
        Fibonacci testObj = Fibonacci.getInstance();
        assertThat(testObj.get(5), equalTo(8L));
    }

    @Test
    public void get2() {
        Fibonacci testObj = Fibonacci.getInstance();
        assertThat(testObj.get(3), equalTo(3L));
    }

}