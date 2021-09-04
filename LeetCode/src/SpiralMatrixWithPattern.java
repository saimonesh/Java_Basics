/*
n=3
pattern="LRU";
L->left
R->right
U->UP
D->Down
form the matrix like
{
9,2,3
8,1,4
7,6,5
}
Start from the middle follow the pattern
* */
public class SpiralMatrixWithPattern {
    int n;
    char[] pattern;

    SpiralMatrixWithPattern(int n, String pat) {
        this.n = n;
        this.pattern = pat.toCharArray();
    }

    public int doSpiral() {
        int middle_i = n / 2, middle_j = n / 2;
        if (n % 2 == 0)
            middle_j = (n - 1) / 2;
        int[] fol = followPattern(middle_i, middle_j);
        middle_i = fol[0];
        middle_j = fol[1];
        if (middle_i == -1 || middle_j == -1) return -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x, val;
                x = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                if (i <= j)
                    val = ((n - 2 * x) * (n - 2 * x) - (i - x) - (j - x));

                else
                    val = ((n - 2 * x - 2) * (n - 2 * x - 2) + (i - x) + (j - x));
                if (i == middle_j && j == middle_i)
                    return val;
            }
        }
        return -1;
    }

    private int[] followPattern(int i, int j) {
        for (char c : pattern) {
            if (i < 0 || j < 0 || i == n || j == n)
                return new int[]{-1, -1};
            switch (c) {
                case 'L':
                    j--;
                    break;
                case 'R':
                    j++;
                    break;
                case 'U':
                    i--;
                    break;
                case 'D':
                    i++;
                    break;
            }
        }
        return new int[]{i, j};
    }

}
