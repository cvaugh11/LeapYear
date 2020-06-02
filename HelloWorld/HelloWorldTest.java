import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.getMessage());
    }
    @Test
    public void testGetMessageWithName() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, Carlton!", hw.getMessage("Carlton"));
    }
}