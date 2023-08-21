
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String data = scanner.next();
            Set<Character> namesSet = new HashSet<>(); // или LinkedHashSet для сохранения порядка


            String[] parts = data.split(",");

            String lastName = parts[0];
            String firstName = parts[1];
            String middleName = parts[2];
            for (char c : lastName.toCharArray()) {
                namesSet.add(c);
            }
            for (char c : firstName.toCharArray()) {
                namesSet.add(c);
            }
            for (char c : middleName.toCharArray()) {
                namesSet.add(c);
            }

            int day = Integer.parseInt(parts[3]);
            int month = Integer.parseInt(parts[4]);
            int year = Integer.parseInt(parts[5]);

            System.out.println(namesSet.size());
            System.out.println(day % 10 + day / 10 + month % 10 + month / 10);
            int ans = namesSet.size() + (day % 10 + day / 10 + month % 10 + month / 10) * 64 + (lastName.charAt(0) - 'A' + 1) * 256;

            String hexNumber = Integer.toHexString(ans);

            System.out.print(hexNumber.substring(hexNumber.length() - 3).toUpperCase() + " ");
        }

    }
}