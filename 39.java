import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] a, int b) {
        List<List<Integer>> r = new ArrayList<>();
        f(a, b, 0, new ArrayList<>(), r);
        return r;
    }
    private void f(int[] a, int b, int i, List<Integer> c, List<List<Integer>> r) {
        if (b == 0) {
            r.add(new ArrayList<>(c));
            return;
        }
        if (b < 0) return;
        for (int j = i; j < a.length; j++) {
            c.add(a[j]);
            f(a, b - a[j], j, c, r);
            c.remove(c.size() - 1);
        }
    }
}