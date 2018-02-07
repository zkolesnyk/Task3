import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void resultToStrEvenXTest() {
        assertEquals(Main.resultToStr(16, 2), "32");
        assertEquals(Main.resultToStr(14, 1), "14");
        assertEquals(Main.resultToStr(12, 0), "0");
        assertEquals(Main.resultToStr(10, -1), "-10");
    }

    @Test
    void resultToStrTestOddXTest() {
        assertEquals(Main.resultToStr(1, 1000), "0,001");
    }
}