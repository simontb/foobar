package de.simontb.foobar.challenge3_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void testWithThreeBricks() throws Exception {
        int staircases = Answer.answer(3);

        assertEquals(1, staircases);
    }

    @Test
    public void testWith200Bricks() throws Exception {
        int staircases = Answer.answer(200);

        assertEquals(487067745, staircases);
    }

    @Test
    public void testRecursiveWithThreeBricks() throws Exception {
        int staircases = Answer.answerRecursive(3);

        assertEquals(1, staircases);
    }

    @Test
    public void testRecursiveWith200Bricks() throws Exception {
        int staircases = Answer.answerRecursive(200);

        assertEquals(487067745, staircases);
    }

}
