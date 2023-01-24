import java.util.HashMap;
import java.util.Map;

public class StringSplitter {

    public static int maxCommonChars(String s) {
        int n = s.length();
        Map<Character, Integer> charCounts = new HashMap<>();
        // Count the occurrences of each character in the string
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        int maxCommon = 0;
        // Go through each character and check the number of common occurrences
        // between the two resulting strings
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            maxCommon += Math.min(entry.getValue(), n - entry.getValue());
        }

        return maxCommon;
    }

    public static void main(String[] args) {
        String s = "abccba";
        System.out.println(maxCommonChars(s)); // Output: 3
    }
}
//This solution uses a HashMap to count the occurrences of each character in the input string. Then, it iterates through the HashMap and adds up the minimum of the character's count and the count of the remaining characters (i.e. n - count). The maximum number of common characters will be the sum of these minimum values.

//Time complexity: O(n) because we are iterating through the input string and the HashMap once, both operations take O(n) time.

//Space complexity: O(n) because we are using a HashMap to store the character counts, which takes O(n) space in the worst case where all characters in the input string are distinct.
