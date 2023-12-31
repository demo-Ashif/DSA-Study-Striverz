package topics.Arrays;

public class MakeEqual {
    public static void main(String[] args) {
        String[] words = {"abc", "aabc", "bc","ccc"};
        boolean result =makeEqual(words);
        System.out.println(result);
    }

    public static boolean makeEqual(String[] words) {
        if (words.length == 1) return true;

        int totalCharCount = 0;
        for (String s : words) {
            totalCharCount += s.length();
        }

        if (totalCharCount % words.length != 0) return false;

        int[] charMap = new int[26];

        for (String s : words) {
            for (char c : s.toCharArray()) {
                charMap[c - 'a']++;
            }
        }
        for (int i : charMap) {
            if (i % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
