package de.simontb.foobar.challenge2_2;

public class Answer {

    public static int[] answer(int h, int[] q) {
        int[] results = new int[q.length];
        for (int index = 0; index < q.length; index++) {
            results[index] = getParent(q[index], h, (int) (Math.pow(2, h) - 1), 1);
        }
        return results;
    }

    private static int getParent(int child, int treeHeight, int ancestor, int depth) {
        if (child == ancestor) return -1;
        int descendant;
        int leftDescendant = (int) (ancestor - Math.pow(2, treeHeight - depth));
        if (child <= leftDescendant) {
            //Child is on the left side of the descendants
            descendant = leftDescendant;
        } else {
            //Child is on the right side of the descendants
            descendant = ancestor - 1;
        }
        if (child == descendant) return ancestor;
        else return getParent(child, treeHeight, descendant, depth + 1);
    }

}
