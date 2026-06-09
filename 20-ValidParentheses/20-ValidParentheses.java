// Last updated: 6/9/2026, 2:05:38 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for (int i = 0; i < s.length(); i++) {
5            char ch = s.charAt(i);
6            if (ch == '(' || ch == '{' || ch == '[') {
7                st.push(ch);
8            } else {
9                if (st.isEmpty()) {
10                    return false;
11                }
12                char top = st.pop();
13                if ((ch == ')' && top != '(') ||
14                    (ch == '}' && top != '{') ||
15                    (ch == ']' && top != '[')) {
16                    return false;
17                }
18            }
19        }
20        return st.isEmpty();
21    }
22}