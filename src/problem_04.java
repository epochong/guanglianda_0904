import java.util.Scanner;
public class problem_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println((int) Math.pow(2 * ((int) (N / Math.sqrt(2))),2));
    }
}
