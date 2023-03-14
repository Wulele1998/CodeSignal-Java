package intro;

public class ElectionsWinners {
    int solution(int[] votes, int k) {
        // N: the length of `votes`
        // time: O(N)
        // space: O(1)
        int maxVote = votes[0];
        int same = 0;
        int count = 0;

        for (int vote : votes) {
            if (maxVote == vote) {
                same++;
            } else if (maxVote < vote) {
                maxVote = vote;
                same = 1;
            }
        }

        if (k == 0) {
            return same == 1 ? 1 : 0;
        }

        for (int vote : votes) {
            if (vote + k >= maxVote) {
                count++;
            }
        }

        return count;
    }
}
