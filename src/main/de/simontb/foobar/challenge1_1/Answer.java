package de.simontb.foobar.challenge1_1;

import java.util.HashMap;
import java.util.Map;

public class Answer {

    private static final Map<Character, Character> characterMap = new HashMap<>();

    static {
        for (char from = 'a', to = 'z'; from <= 'z'; from++, to--) {
            characterMap.put(from, to);
        }
    }

    public static String answer(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (characterMap.containsKey(chars[i])) {
                chars[i] = characterMap.get(chars[i]);
            }
        }
        return String.valueOf(chars);
    }

}
