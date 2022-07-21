import java.util.Scanner;

public class Star {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    String row =  "";

    for (int i = 0; i < a; i += 1) {
      row += "*";
    }

    String answer = "";
    for (int i = 0; i < b; i += 1) {
      answer += (row + "\n");
    }

    System.out.println(answer);
  }
}
