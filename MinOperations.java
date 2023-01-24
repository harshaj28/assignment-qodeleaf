public class ArraySpecializer {
    public static int minOperations(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int count = 0;
        // Find the maximum element in the array
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        // Count the number of occurrences of the maximum element
        for (int i = 0; i < n; i++) {
            if (arr[i] != max) {
                count++;
            }
        }
        // Divide the count by 3 and round up to the nearest integer
        // to get the minimum number of operations
        return (count + 2) / 3;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 2, 2, 7};
        System.out.println(minOperations(arr)); // Output: 2
    }
}
//This solution first finds the maximum element in the input array. Then it counts the number of occurrences of elements that are not equal to the maximum element. Finally, it divides this count by 3 and rounds up to the nearest integer to get the minimum number of operations required to make the array special.

//Time complexity: O(n) because we are iterating through the input array twice, both operations take O(n) time.

//Space complexity: O(1) because we are only using a few variables and no additional data structures, so the space complexity is constant.
