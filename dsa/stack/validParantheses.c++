// 20. Valid Parentheses

class Solution {
public:
    
    char getMatchingOpening(char closing) {
        if (closing == ')') return '(';
        if (closing == ']') return '[';
        return '{';
    }

    bool isValid(string s) {
        stack<char> st;

        for (char c : s) {

            // If opening bracket → push to stack
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            else {
                // If stack empty → invalid
                if (st.empty()) return false;

                // Check matching bracket
                if (st.top() == getMatchingOpening(c)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.empty();
    }
};