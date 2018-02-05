import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void resultToStrTest() {
        // arrange
        int x = 1;
        int y = 100;
        String actual = "0,01";

        // act
        String expected = Main.resultToStr(x, y);

        // assert
        assertEquals(actual, expected);
    }
}