class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26]; // count letters in s1
        int[] count2 = new int[26]; // count letters in current window of s2

        // fill count1 for s1
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        int window = s1.length();

        // first window in s2
        for (int i = 0; i < window; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        // check first window
        if (matches(count1, count2)) return true;

        // slide the window
        for (int i = window; i < s2.length(); i++) {
            // add new char
            count2[s2.charAt(i) - 'a']++;
            // remove old char
            count2[s2.charAt(i - window) - 'a']--;

            if (matches(count1, count2)) return true;
        }

        return false;
    }

    // helper function to compare arrays
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
