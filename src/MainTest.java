import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testNegativeAge() {
        String result = Main.calculateAgeCategory(-5);
        assertEquals("Invalid", result);
    }

    @Test
    public void testChildAge() {
        String result = Main.calculateAgeCategory(7);
        assertEquals("Child", result);
    }

    @Test
    public void testTeenagerAge() {
        String result = Main.calculateAgeCategory(16);
        assertEquals("Teenager", result);
    }

    @Test
    public void testAdultAge() {
        String result = Main.calculateAgeCategory(35);
        assertEquals("Adult", result);
    }

    @Test
    public void testSeniorAge() {
        String result = Main.calculateAgeCategory(70);
        assertEquals("Senior", result);
    }
}
