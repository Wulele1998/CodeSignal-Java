package core;

public class WillYou {
    boolean solution(boolean young, boolean beautiful, boolean loved) {
        // time: O(1)
        // space: O(1)
        if (young && beautiful && loved) {
            return false;
        }
        if (!(young && beautiful) && !loved) {
            return false;
        }

        return true;
    }
}
