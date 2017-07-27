package de.simontb.foobar.challenge2_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void testInField() throws Exception {
        int steps = Answer.answer(19, 36);

        assertEquals(1, steps);
    }

    @Test
    public void testInCorner() throws Exception {
        int steps = Answer.answer(0, 1);

        assertEquals(3, steps);
    }

}
