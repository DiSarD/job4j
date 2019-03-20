package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenRightMaxLeftThenOk() {
        Max max = new Max();
        int left = 1;
        int right = 2;
        int expected = right;
        int result = max.max(left,right);
        assertThat(result,is(expected));
    }

    @Test
    public void whenLeftMaxRightThenOk() {
        Max max = new Max();
        int left = 2;
        int right = 1;
        int expected = left;
        int result = max.max(left,right);
        assertThat(result,is(expected));
    }
    @Test
    public void whenLeftEquRightThenOk() {
        Max max = new Max();
        int left = 2;
        int right = 2;
        int result = max.max(left,right);
        assertThat(result,is(right));
        assertThat(result,is(left));
    }
}
