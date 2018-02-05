import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void progTest(int x, int y) {
        // arrange
        x = 1;
        y = 100;
        float actual = 0.01f;

        // act
        float expected = Main.prog(x, y);

        // assert
        assertEquals(actual, expected);
    }
}