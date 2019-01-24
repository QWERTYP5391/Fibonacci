import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private static final int SIZE = 100;
    private static Fibonacci instance;
    private static List<Integer> memo = new ArrayList<Integer>();

    public long get(int n) {
        return memo.get(n);
    }


    private Fibonacci() {

    }

    public static Fibonacci getInstance() {
        synchronized (memo) {
            if (instance == null) {
                instance = new Fibonacci();
                memo.add(1);
                memo.add(1);
                for (int i = 2; i < SIZE; i++) {
                    memo.add(memo.get(i - 1) + memo.get(i - 2));
                }
            }
        }
        return instance;

    }
}
