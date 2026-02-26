package maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMensaje() {
        String expected = "Hello world!";
        String actual = Main.mensaje();
        assertEquals(expected, actual);
    }
}
