package common.solutions.easy.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckIfExist {
    //    Task 1346. Check If N and Its Double Exist  https://leetcode.com/problems/check-if-n-and-its-double-exist/


    public void checkIfExist(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String data = scanner.next();
            Set<String> namesSet = new HashSet<>(); // или LinkedHashSet для сохранения порядка


            String[] parts = data.split(",");

            String lastName = parts[0];
            String firstName = parts[1];
            String middleName = parts[2];
            namesSet.add(lastName);
            namesSet.add(firstName);
            namesSet.add(middleName);

            int day = Integer.parseInt(parts[3]);
            int month = Integer.parseInt(parts[4]);
            int year = Integer.parseInt(parts[5]);

            int ans = namesSet.size() + (day%10 + day/10 + month%10+month/10)*64 + (lastName.charAt(0) - 'A' + 1)*256;

            String hexNumber = Integer.toHexString(ans);

            System.out.print( hexNumber.substring(hexNumber.length() - 3).toUpperCase()+ " ");

        }
    }
}
