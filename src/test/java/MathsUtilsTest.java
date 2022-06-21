import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsUtilsTest {

    @Test
    @DisplayName("Should add two numbers")
    void additionner() {
        assertEquals(4,MathsUtils.additionner(2,2));
        assertEquals(0,MathsUtils.additionner(-2,2));
        assertEquals(-4,MathsUtils.additionner(-2,-2));
        int [] tab = {1,5,6};
        assertEquals(12,MathsUtils.additionner(tab));
        assertEquals(13,MathsUtils.additionner(new int[]{1,5,6,1}));

    }

    @Test
    @DisplayName("Should multiply two numbers")
    void multiplier() {
        assertEquals(16,MathsUtils.multiplier(4,4));
        assertEquals(-16,MathsUtils.multiplier(-4,4));
        assertEquals(16,MathsUtils.multiplier(-4,-4));

    }
    @Test
    @DisplayName("Should substract two numbers")
    void soustraire() {
        assertEquals(0,MathsUtils.soustraire(4,4));
        assertEquals(-8,MathsUtils.soustraire(-4,4));
        assertEquals(0,MathsUtils.soustraire(-4,-4));


    }
}