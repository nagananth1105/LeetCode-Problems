class Solution {
    public String smallestNumber(String pattern) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = pattern.length();
        for(int i = 0; i <= n; i++){
            st.push((char)((i + 1) + '0'));

            if(i == n || pattern.charAt(i) == 'I'){
                while(!st.isEmpty())
                    sb.append(st.pop());
            }
        }
        return sb.toString();
    }
}