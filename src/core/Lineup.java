package core;

public class Lineup {
    int solution(String commands) {
        // N: the length of `commands`
        // time: O(N)
        int[] dir = new int[] { 0, 0, 0, 0 };
        int count = 0;

        for (char c : commands.toCharArray()) {
            switch (c) {
                case 'L' -> {
                    for (int i = 0; i < 4; i++) {
                        if (i != 1)
                            dir[i] = (dir[i] + 1) % 4;
                    }
                    dir[1] = (dir[1] + 3) % 4;
                }
                case 'R' -> {
                    for (int i = 0; i < 4; i++) {
                        if (i != 1)
                            dir[i] = (dir[i] + 3) % 4;
                    }
                    dir[1] = (dir[1] + 1) % 4;
                }
                case 'A' -> {
                    for (int i = 0; i < 4; i++) {
                        dir[i] = (dir[i] + 2) % 4;
                    }
                }
            }

            boolean flag = true;
            for (int i = 1; i < 4; i++) {
                if (dir[i] != dir[i - 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }

    int solution2(String commands) {
        int count = 0;
        boolean s = true;

        for (char c : commands.toCharArray()) {
            if (c == 'L' || c == 'R')
                s = !s;
            if (s)
                count++;
        }

        return count;
    }
}
