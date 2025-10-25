import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces:");
        String inputLine = sc.nextLine().trim();
        String[] inputParts = inputLine.split("\\s+");
        int[] arr = new int[inputParts.length];
        for (int i = 0; i < inputParts.length; i++) {
            arr[i] = Integer.parseInt(inputParts[i]);
        }

        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : arr) {
                if (num % i == 0) {
                    count++;
                }
            }
            countMap.put(i, count);
        }

        StringBuilder output = new StringBuilder("{");
        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (!first) {
                output.append(", ");
            }
            output.append(entry.getKey()).append(": ").append(entry.getValue());
            first = false;
        }
        output.append("}");
        System.out.println(output);

        sc.close();
    }
}
