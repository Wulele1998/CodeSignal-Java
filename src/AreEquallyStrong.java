public class AreEquallyStrong {
    boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        // time: O(1)
        // space: O(1)
        return Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight) &&
                Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight);
    }
}
