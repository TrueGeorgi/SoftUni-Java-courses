import java.util.*;
import java.util.stream.Collectors;

public class AE04_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] lisLength = new int[nums.length];
        int[] previousIndex = new int[nums.length];
        int maxLisLength = 0;
        int lisEndIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int maxLength = 0;
            int previous = -1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && lisLength[j] > maxLength) {
                    maxLength = lisLength[j];
                    previous = j;
                }
            }
            lisLength[i] = maxLength + 1;
            previousIndex[i] = previous;
            if (lisLength[i] > maxLisLength) {
                maxLisLength = lisLength[i];
                lisEndIndex = i;
            }
        }
        List<Integer> lis = new ArrayList<>();
        while (lisEndIndex != -1) {
            lis.add(nums[lisEndIndex]);
            lisEndIndex = previousIndex[lisEndIndex];
        }
        Collections.reverse(lis);
        String output = String.valueOf(lis).replace("[", "").replace("]", "").replace(",", "");
        System.out.println(output);
    }
}
