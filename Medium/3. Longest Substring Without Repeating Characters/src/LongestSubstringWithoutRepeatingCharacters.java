import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String s = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }

        return max;
    }

    public static int length(String s) {

        int max = 0;
        int[] pos = new int[128];

        int start = 0;
        int end = 0;

        for (char c : s.toCharArray()) {

            start = Math.max(start, pos[c]);
            max = Math.max(max, end - start + 1);
            pos[c] = end + 1;
            end++;
        }

        return max;
    }

    public int lengthLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int startWindow = 0;
        int maxLength = 0;

        for(int endWindow = 0; endWindow < s.length(); endWindow++) {

            while (set.contains(s.charAt(endWindow))){
                set.remove(s.charAt(startWindow));
                startWindow++;
            }
            set.add(s.charAt(endWindow));
            maxLength = Math.max(maxLength, endWindow - startWindow + 1);
        }
        return maxLength;
    }
}
