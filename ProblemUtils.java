import java.util.Scanner;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;

/**
 * Methods helpful to problems
 */
public class ProblemUtils {
    private ProblemUtils() {

    }

    /**
     * Basically a wrapped for loop. It will run the logic "X" amount of times where
     * "X" is the first number entered into {@code System.in} (the standard input
     * stream).
     * 
     * @param sc    scanner to get the first line entered
     * @param logic the logic that will run "X" amount of times
     */
    public static void testCases(Scanner sc, Runnable logic) {
        int times = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < times; i++) {
            logic.run();
        }
    }
    /**
     * Swaps 2 integers
     * @param a first integer
     * @param b second integer
     */
    public static void swap(int a, int b){
        a ^= b;
        b ^= a;
        a ^= b;
    }
    /**
     * 
     * @param N number
     * @return number of digits
     */
    public static double numDigits(double N){
        return Math.floor(Math.log10(N)) + 1;
    }

    /**
     * Maps one value from one range to another
     * 
     * @param x       value meing mapped
     * @param in_min
     * @param in_max
     * @param out_min
     * @param out_max
     * @return mapped value
     */
    public static long map(long x, long in_min, long in_max, long out_min, long out_max) {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }


    /**
     * Calculates time based on seconds, can have weeks/months added if desired
     * @param seconds
     */
    public static void calculateTime(long seconds) {
        int day = (int)TimeUnit.SECONDS.toDays(seconds);        
        long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);

        System.out.println("Day " + day + " Hour " + hours + " Minute " + minute + " Seconds " + second);

    }

    /**
     * Returns if a given string is a palindrome or not.
     * @param str 
     * @return true if palindrome, false if not.
     */
    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString()) ? true : false;
    }

    /**
     * Checks to see if the number is even.
     * @param n number being checked
     * @return true if even, false if odd
     */
    public static boolean isEven(long n) {
        return n % 2 == 0;
    }

}
