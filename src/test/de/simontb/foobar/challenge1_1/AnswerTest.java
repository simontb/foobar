package de.simontb.foobar.challenge1_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void testLowercaseInput() throws Exception {
        String solution = "did you see last night's episode?";
        String encrypted = "wrw blf hvv ozhg mrtsg'h vkrhlwv?";

        String decrypted = Answer.answer(encrypted);

        assertEquals(solution, decrypted);
    }

    @Test
    public void testUpperAndLowercaseInput() throws Exception {
        String solution = "Yeah! I can't believe Lance lost his job at the colony!!";
        String encrypted = "Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!";

        String decrypted = Answer.answer(encrypted);

        assertEquals(solution, decrypted);
    }
    
}