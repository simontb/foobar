package de.simontb.foobar.challenge2_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void testWithHeightThree() throws Exception {
        int[] result = Answer.answer(3, new int[]{7, 3, 5, 1});

        assertArrayEquals(new int[]{-1, 7, 6, 3}, result);
    }

    @Test
    public void testWithHeightFive() throws Exception {
        int[] result = Answer.answer(5, new int[]{19, 14, 28});

        assertArrayEquals(new int[]{21, 15, 29}, result);
    }

}
