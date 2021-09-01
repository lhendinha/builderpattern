import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    private Computer comp;

    @BeforeEach
    void setUp() {
        comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setGraphicsCardEnabled(true)
                .build();
    }

    @Test
    void getSSD() {
        System.out.println("Running: testGetSSD");
        assertEquals(comp.getSSD(), "500 GB");
    }

    @Test
    void getRAM() {
        System.out.println("Running: testGetRAM");
        assertEquals(comp.getRAM(), "2 GB");
    }

    @Test
    void isGraphicsCardEnabled() {
        System.out.println("Running: testIsGraphicsCardEnabled");
        assertEquals(comp.isGraphicsCardEnabled(), true);
    }
}