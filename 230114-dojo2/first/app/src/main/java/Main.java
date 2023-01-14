import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String a, b;
        a = scanner.nextLine();
        b = scanner.nextLine();

        int numbers = Integer.parseInt(a);
        String[] directions = b.split(" ");

        int result = process(numbers, directions);

        System.out.println(result);
    }

    public static int process(int numbers, String[] directions) {
        if (numbers == 1) {
            return 1;
        }

        List<String> lists = new ArrayList<>();

        for (int i = 0; i < directions.length; i += 1 ) {
            if (i + 1 <= directions.length - 1 && directions[i].equals(directions[i + 1])) {
                lists.add(directions[i]);
                continue;
            }

            if (i - 1 >= 0 && directions[i].equals(directions[i - 1])) {
                lists.add(directions[i]);
            }
        }

        if (lists.size() == 0) {
            return 1;
        }

        int left = lists.stream().filter(value -> value.equals("1")).collect(Collectors.toList()).size();
        int right = lists.stream().filter(value -> value.equals("2")).collect(Collectors.toList()).size();

        if (Math.abs(left - right) > left && Math.abs(left - right) > right) {
            return Math.abs(left - right);
        }

        return Math.max(left, right);
    }
}
