import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void should_say_hello_somkiat() {
        Hello hello = new Hello();
        String actualResult = hello.sayHi("somkiat");
        assertEquals("Hello, somkiat", actualResult);
    }

}
