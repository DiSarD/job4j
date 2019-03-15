package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author a.makarov
 * @version $Id$
 * @since 0.1
 */

public class CalculatorTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 3D;
        assertThat(result, is(expected));
    }

    /**
     * Test sub.
     */

    @Test
    public void whenFourMinusTwoThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.sub(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test div.
     */

    @Test
    public void whenFourDivTwoThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.div(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test mult.
     */

    @Test
    public void whenTwoMultipleThreeThenSix() {
        Calculator calc = new Calculator();
        double result = calc.mult(2D, 3D);
        double expected = 6D;
        assertThat(result, is(expected));
    }

}
