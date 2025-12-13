class 3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0; // start of window
        int maxLen = 0;

        // store last index of every character
        int[] lastIndex = new int[256];
        // initialize with -1
        for (int i = 0; i < 256; i++) lastIndex[i] = -1;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            // if repeated character found inside the window
            if (lastIndex[c] >= left) {
                left = lastIndex[c] + 1;   // move window
            }

            // update last seen position of current character
            lastIndex[c] = right;

            // update longest length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
