import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    @DisplayName("สวัสดี somkiat")
    public void xxxx() {
        Hello hello = new Hello();
        String actualResult = hello.sayHi("somkiat");
        assertEquals("Hello, somkiat", actualResult);
    }

}
