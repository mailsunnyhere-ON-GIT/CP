//backtracking soln
class Solution {
    private HashMap<Integer, String> hm = new HashMap<>() {{put(1, "");put(2, "abc");put(3, "def");
        put(4, "ghi");put(5, "jkl");put(6, "mno");put(7, "pqrs");put(8, "tuv");put(9, "wxyz");}};
    private List<String> ls = new ArrayList<>();
    private void called(String str, int i, StringBuilder op) {
        if (i == str.length()) {
            ls.add(op.toString());
            return;
        }
        int k = str.charAt(i) - '0';
        String s = hm.get(k);
        if (s != null) {
            for (int j = 0; j < s.length(); j++) {
                op.append(s.charAt(j));
                called(str, i + 1, op);
                op.deleteCharAt(op.length() - 1);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        called(digits, 0, new StringBuilder());
        return ls;
    }

}
