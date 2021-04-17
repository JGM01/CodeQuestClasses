import java.util.Scanner;
import java.lang.Runnable;

/**
 * Methods helpful to problems
 */
public class ProblemUtils {
    private ProblemUtils() {

    }

    /**
     * Basically a wrapped for loop. It will run the logic "X" amount of times where "X" is the first number entered into {@code System.in} (the standard input stream).
     * @param sc scanner to get the first line entered
     * @param logic the logic that will run "X" amount of times
     */
    public static void testCases(Scanner sc, Runnable logic) {
        int times = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < times; i++) {
            logic.run();
        }
    }
}
