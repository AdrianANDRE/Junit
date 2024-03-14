import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class owltest {
    @Test
    public void testSuccess() {
        System.out.println("Success test");
    }
    @Test
    public void testFailed() {
        assertTrue(8 == 7, "Failed test");;
    }
}
