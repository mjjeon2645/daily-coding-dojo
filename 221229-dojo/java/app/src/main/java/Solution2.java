import java.util.Scanner;

class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 0;

        while (b > i) {
            System.out.println("*".repeat(a));
            i += 1;
        }
    }
}
