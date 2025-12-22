class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        track(result, "", 0, 0, n);
        return result;
    }
    private void backtrack(List<String> result, String current, int open, int close, int n) {
     if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
    if (open < n) {
            track(result, current + "(", open + 1, close, n);
        }
       if (close < open) {
            track(result, current + ")", open, close + 1, n);
        }
    }
}