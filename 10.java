class Solution {
    public boolean isMatch(String s, String p) {

        // If pattern is empty, string must be empty
        if (p.length() == 0)
            return s.length() == 0;

        // Check first character match
        boolean firstMatch = (s.length() > 0 &&
                (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        // If next pattern character is '*'
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Two options:
            // 1. Ignore x*   OR
            // 2. Use x* if first character matches
            return isMatch(s, p.substring(2)) ||
                   (firstMatch && isMatch(s.substring(1), p));
        }
        else {
            // Normal match
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
