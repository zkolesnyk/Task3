import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void resultToStrTest() {
        // arrange
        int x = 1;
        int y = 1000;
        String actual = "0,001";

        // act
        String expected = Main.resultToStr(x, y);

        // assert
        assertEquals(expected, actual);
    }
}