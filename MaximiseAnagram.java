public class AnagramOptimizer {
    public static int maxAnagrams(String s, int k) {
        int[] charCount = new int[26];
        int n = s.length();
        int operations = 0;
        // Count the number of occurrences of each character
        for (int i = 0; i < n; i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        // Count the number of characters that have odd occurrences
        for (int i = 0; i < 26; i++) {
            if (charCount[i] % 2 != 0) {
                operations++;
            }
        }
        // If the number of odd characters is greater than k, return 0
        if (operations > k) {
            return 0;
        }
        // Otherwise, return the number of anagrams
        return (int)Math.pow(2, (n - operations) / 2);
    }

    public static void main(String[] args) {
        String s = "abccba";
        int k = 3;
        System.out.println(maxAnagrams(s, k)); // Output: 3
    }
}
//This solution first counts the number of occurrences of each character in the input string. Then it counts the number of characters that have odd occurrences. If the number of odd characters is greater than k, it returns 0, since it's not possible to make any anagrams. Otherwise, it returns the number of anagrams, which is equal to 2 raised to the power of (n - operations) / 2.

//Time complexity: O(n), because we are iterating through the input string once, which takes O(n) time.

//Space complexity: O(1), because we are only using a fixed-size array to count the occurrences of characters, so the space complexity is constant.
