import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class skipTest {

    @Test
    @Disabled
    public void testSuccess() {
        System.out.println("Success test");
    }
    @Test
    @Disabled
    public void testFailed() {
        assertTrue(8 == 7, "8 is not 7");
    }
}
