package core;

public class ReachNextLevel {
    boolean solution(int experience, int threshold, int reward) {
        // time: O(1)
        // space: O(1)
        return experience + reward >= threshold;
    }
}
