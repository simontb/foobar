package de.simontb.foobar.challenge2_1;

import java.security.InvalidParameterException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Answer {

    public static int answer(int src, int dest) {
        if (src < 0 || src > 63 || dest < 0 || dest > 63)
            throw new InvalidParameterException();
        Set<Integer> alreadyReachedFields = new LinkedHashSet<>(64);
        alreadyReachedFields.add(src);
        int steps = 0;
        while (!alreadyReachedFields.contains(dest)) {
            steps++;
            Set<Integer> oldFields = new LinkedHashSet<>(alreadyReachedFields);
            for (int source : oldFields) {
                alreadyReachedFields.addAll(getPossibleNextFields(source));
            }
        }
        return steps;
    }

    private static Set<Integer> getPossibleNextFields(int src) {
        Set<Integer> nextFields = new LinkedHashSet<>(8);
        if (src >= 8) {
            //We are down enough to go up once, now check if we can go left and/or right twice
            if (src % 8 >= 2) {
                nextFields.add(src - 10);
            }
            if (src % 8 < 6) {
                nextFields.add(src - 6);
            }
            if (src >= 16) {
                //We are down enough to go up twice, now check if we can go left and/or right
                if (src % 8 >= 1) {
                    nextFields.add(src - 17);
                }
                if (src % 8 < 7) {
                    nextFields.add(src - 15);
                }
            }
        }
        if (src < 56) {
            //We are up enough to go down once, now check if we can go left and/or right twice
            if (src % 8 >= 2) {
                nextFields.add(src + 6);
            }
            if (src % 8 < 6) {
                nextFields.add(src + 10);
            }
            if (src < 48) {
                //We are up enough to go down twice, now check if we can go left and/or right once
                if (src % 8 >= 1) {
                    nextFields.add(src + 15);
                }
                if (src % 8 < 7) {
                    nextFields.add(src + 17);
                }
            }
        }
        return nextFields;
    }

}
