import java.util.HashSet;
import java.util.Set;

public class BeautifulNumbers_PAYPAL {
    long[] result =new long[1000005];
    public void pre() {
        for (int i = 1; i <= 1000000; i++) {
            Set<Long> set = new HashSet<>();
            if (isBeautiful(i, set)) {
                result[i] = i;
            }
        }


        for (int i = 1; i <= 1000000; i++) {
            result[i] += result[i - 1];
        }

    }


    private boolean isBeautiful(long n, Set<Long> set) {
        while (true) {
            if (n == 1) {
                return true;
            } else if (set.contains(n)) {
                return false;
            }
            set.add(n);
            long num = 0;
            while (n > 0) {
                num += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = num;
        }
    }

    public long solve(int l, int r) {
        pre();
        return result[r] - result[l - 1];


    }


}
