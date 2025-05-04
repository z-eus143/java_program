import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class TestClass {
    public static void main(String args[]) throws Exception {
        // Use BufferedReader for fast input handling for large inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read N and handle edge cases
        long N = Long.parseLong(br.readLine().trim()); // Read N
        if (N == 0) {
            System.out.println(0); // Edge case when N = 0
            return;
        }

        // Read array elements as a single line
        String[] input = br.readLine().trim().split(" ");
        if (input.length != N) {
            System.out.println("Invalid input: Number of elements does not match N");
            return;
        }

        // Use long[] for storing elements
        long[] arr = new long[(int) N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(input[i]); // Parse each element as long
        }

        // Call the method to process the array
        System.out.println(favSinger(arr));
    }

    public static long favSinger(long[] arr) {
        // Use a HashMap to store the frequencies of the numbers, with long keys and values
        HashMap<Long, Long> map = new HashMap<>();
        long maxFrequency = 0;
        long maxCount = 0;

        // Loop through the array to count frequencies and track the max frequency
        for (long num : arr) {
            long count = map.getOrDefault(num, 0L) + 1; // Use 0L to ensure we're working with long
            map.put(num, count);

            // Update maxFrequency and maxCount
            if (count > maxFrequency) {
                maxFrequency = count;
                maxCount = 1; // Reset count for the new max frequency
            } else if (count == maxFrequency) {
                maxCount++;
            }
        }

        return maxCount;
    }
}