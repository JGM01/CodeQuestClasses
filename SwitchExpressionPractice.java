import java.util.Scanner;

public class SwitchExpressionPractice {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = switch(Integer.parseInt(sc.nextLine())) {
            case 1 -> "lol";
            default -> "LOOOLLL";
        };
        System.out.println(s);
    }
}
