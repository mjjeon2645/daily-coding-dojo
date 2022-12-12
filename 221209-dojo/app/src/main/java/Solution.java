public class FrendsBlock {
    public int solution(int m, int n, String[] board) {
        char[][] blocks = new char[m][];

        for (int i = 0; i < m; i += 1)
            blocks[i] = board[i].toCharArray();

        int answer = 0;

        while (true) {
            char[][] nextBlocks = new char[m][];
            for (int i = 0; i < m; i += 1)
                nextBlocks[i] = blocks[i].clone();

            boolean ck = false;

            for (int i = 0; i < m - 1; i += 1) {
                for (int j = 0; j < n - 1; j += 1) {
                    if (blocks[i][j] == '.')
                        continue;

                    if (blocks[i][j] == blocks[i + 1][j]
                        && blocks[i][j] == blocks[i][j + 1]
                        && blocks[i][j] == blocks[i + 1][j + 1]) {
                        nextBlocks[i][j] = nextBlocks[i + 1][j] = nextBlocks[i][j + 1] = nextBlocks[i + 1][j + 1] = '.';
                        ck = true;
                    }
                }
            }
            if (!ck)
                break;

            for (int i = 0; i < m; i += 1)
                for (int j = 0; j < n; j += 1)
                    if (blocks[i][j] != nextBlocks[i][j])
                        answer += 1;


            for (int i = 0; i < n; i += 1) {
                int blank = m - 1;

                while (true) {
                    while (blank >= 0 && nextBlocks[blank][i] != '.')
                        blank--;

                    int block = blank;
                    while (block >= 0 && nextBlocks[block][i] == '.')
                        block--;

                    if (block < 0)
                        break;

                    nextBlocks[blank][i] = nextBlocks[block][i];
                    nextBlocks[block][i] = '.';
                }
            }

            blocks = nextBlocks;
        }

        return answer;
    }
}
